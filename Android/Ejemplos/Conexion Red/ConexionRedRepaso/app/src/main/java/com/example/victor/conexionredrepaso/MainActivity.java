package com.example.victor.conexionredrepaso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private boolean hiHaXarxa;
    protected RecyclerView rvTradicional, rvGson;
    protected ArrayList<Contacte> contactesParsejats;
    protected LinearLayoutManager rvLM;
    final String TAG = "XarxaJSON";
    String documentJSON;
    protected TextView tv_etiqueta1;
    protected AdaptadorContacte ac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactesParsejats = new ArrayList<Contacte>();
        tv_etiqueta1 = (TextView) findViewById(R.id.etiqueta1);

        //------------------------------------------------------------------------------------------
        //*************************     IMPORTANT!!!!!
        //Aquestes instruccions han d'anar juntes, sinó no ens funcionarà el RecyclerView
        rvTradicional = (RecyclerView) findViewById(R.id.rvTradicional);
        rvLM = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);//Triem el LayoutManager que volem utilitzar i l'assignem a l'objecte recyclerView
        rvTradicional.setLayoutManager(rvLM);
        rvTradicional.setHasFixedSize(true);  // Si tots els component del RecyclerViw ténen la mateixa amplària
        //------------------------------------------------------------------------------------------

        //rvGson = (RecyclerView) findViewById(R.id.rvGSON);

        hiHaXarxa = comprovaConnexio();
        if(hiHaXarxa){
            Log.d(TAG, "Vaig a connectar...");
            new ConnectaURL().execute("https://jsonplaceholder.typicode.com/users");

        }

    }

    protected boolean comprovaConnexio(){
        ConnectivityManager connMgr = (ConnectivityManager)  getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null  &&  networkInfo.isConnected()) {
            // podem fer la connexió a alguna URL
            hiHaXarxa=true;
            Log.d(TAG, "Vaig a connectar...");
            new ConnectaURL().execute("https://jsonplaceholder.typicode.com/users");

            return true;
        } else {
            // mostrem un error indicant que no dispossem de connexió a la Xarxa
            Snackbar mySnackbar = Snackbar.make(findViewById(R.id.relativeLayout),
                    "No hi ha connexió a la Xarxa", Snackbar.LENGTH_INDEFINITE);
            mySnackbar.setAction("Tornar a provar", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hiHaXarxa = comprovaConnexio();

                }
            });
            mySnackbar.show();
            return false;
        }
    }

    private String connectaURL(String llocAConnectar){
        URL url;
        String resposta=null;
        try {
            Log.d(TAG,"Iniciant la connexió: (");

            url = new URL(llocAConnectar);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET"); // Podrà ser PUT, POTS,GET,DELETE,HEAD,OPTIONS,TRACE, vegeu api
            conn.setDoInput(true); /* anem a rebre dades */
            // Comença la connexió

            conn.connect();

            int response = conn.getResponseCode();
            Log.d(TAG, "Rebent dades des del Servidor en streaming: ");
            InputStream  is = new BufferedInputStream(conn.getInputStream());
            Log.d(TAG,"Convertint l'streaming en un String: ");
            resposta = converteixStreamAString(is);
            Log.d(TAG,"Resposta: ("+response+")"+resposta);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            return resposta;
        }
    }


    private String converteixStreamAString(InputStream is) {

        BufferedReader reader = null;  // buffer on anirem llegint el document JSON que ens envie el servidor
        StringBuilder sb = new StringBuilder(); // Cadena on anirem afegint les dades del document JSON
        //conforme les anem llegint del buffer, línia a línia


        try {
            // creem un buffer per a anar llegint del InputStreamReader
            reader = new BufferedReader(new InputStreamReader(is));

            String line;
            // Bucle per a llegir totes les línies que ens envia el servidor
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');  // afegim la línia llegida a la cadena
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();  // Tanquem l'InputStreamReader
                reader.close(); // Tanquem el BufferReader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
