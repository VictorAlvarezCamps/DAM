package com.example.victor.asynctaskrepaso;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

class Inici extends AppCompatActivity {

    final String LABEL = "BAT";  //Per a debugar
    final int NOMBRE_SEGONS = 5;  // Segons que durarà la nostra tasca

    TextView missatgeInformatiu, percentatge;
    ProgressBar barraDeProgres;
    Button botoCancelar, botoIniciar;

    LaMeuaTasca lmt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        missatgeInformatiu = (TextView) findViewById(R.id.missatge_info);
        percentatge = (TextView) findViewById(R.id.percentatge);
        barraDeProgres = (ProgressBar) findViewById(R.id.progress_bar);
        botoCancelar = (Button) findViewById(R.id.cancelar);
        botoIniciar = (Button) findViewById(R.id.iniciar);

        barraDeProgres.setMax(NOMBRE_SEGONS);  //Establim el valor de la barra de progrés




        lmt = new LaMeuaTasca(); // Crearé una nova tasca


        botoIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LABEL, "polsat botó iniciar");
                lmt.execute();  //Executem l'AsyncTask en altre thread
                Log.d(LABEL, "fent boto inici invisible");
                view.setVisibility(View.INVISIBLE); //Desactiven el botó iniciar, ja que un AsyncTask
                // només s'ha de poder executar una vegada. Sino donaria es pararia l'app.
            }
        });

        botoCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LABEL, "polsat botó cancelar");
                lmt.cancel(true);   // L'usuari decideix cancel.lar l'AsyncTask
                botoIniciar.setVisibility(view.INVISIBLE);//Desactiven el botó iniciar, ja que un AsyncTask
                // només s'ha de poder executar una vegada. Sino donaria es pararia l'app.
            }
        });


    }

    public ProgressBar getBarraDeProgress(){
        return this.barraDeProgres;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inici, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void actualitzaBarraIText(Integer valorBProgres, String valorText){

        Log.d(LABEL, "actualitzant progress.." + valorBProgres.toString());
        missatgeInformatiu.setText("Comencem la tasca de llarga durada ...");
        barraDeProgres.setProgress(valorBProgres.intValue());
        Log.d(LABEL, "actualitzant percentatge.." + valorText);
        percentatge.setText("" + valorText);

    }



    //----------------------------------------------------------------------
    private  class LaMeuaTasca extends AsyncTask<Void, Object, Void> {

        @Override
        //En onPreExecute, encara podem actualitzar l'IU
        protected void onPreExecute() {

        }

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 1; (i <= NOMBRE_SEGONS) && (!this.isCancelled()); i++)
                try {
                    Thread.sleep(1000);
                    Object parametres[] = {i, (100 * i / NOMBRE_SEGONS) + " %"};
                    Log.d(LABEL,"Actualitzant progress bar a "+i);
                    publishProgress(parametres);  //Per poder actualitzar la IU, ho fem mitjançant el mètode
                    // publishProgress, que executarà el mètode onProgressUpdate()
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            return null;
        }

        @Override
        protected void onProgressUpdate(Object... valor) {
            actualitzaBarraIText((Integer) valor[0],(String)valor[1]);
        }

        @Override
        protected void onPostExecute(Void resultat) {
            super.onPostExecute(resultat);
            missatgeInformatiu.setText("Tasca Acabada!!!");
            barraDeProgres.setVisibility(ProgressBar.GONE);
            return;
        }

        @Override
        protected void onCancelled(Void resultat) {
            super.onCancelled(resultat);
            missatgeInformatiu.setText("Tasca Cancel·lada!!!");
            barraDeProgres.setProgress(0);
            return;
        }

    }

}