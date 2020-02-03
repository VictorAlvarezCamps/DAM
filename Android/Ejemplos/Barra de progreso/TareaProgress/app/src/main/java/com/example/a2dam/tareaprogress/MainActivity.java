package com.example.a2dam.tareaprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView MensajeInfo;
    TextView Porcentaje;
    ProgressBar pb;
    Button iniciar;
    Button cancelar;
    MiTarea MT;
    Integer entrada[]={new Integer(100)};

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MensajeInfo = (TextView) findViewById(R.id.missatge_info);
        Porcentaje = (TextView) findViewById(R.id.percentatge);
        pb = (ProgressBar) findViewById(R.id.progress_bar);
        iniciar = (Button) findViewById(R.id.b_iniciar);
        cancelar = (Button)findViewById(R.id.b_cancelar);

        MT = new MiTarea(Porcentaje,pb,MensajeInfo);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.setVisibility(View.VISIBLE);
                pb.setProgress(0);
                pb.setMax(100);

                MT = (MiTarea)getLastNonConfigurationInstance();

                if(MT!=null) {
                    MT.execute(entrada);
                }
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MT.cancel(true);
                MensajeInfo.setText("Tarea cancelada");
            }
        });

    }

    public Object onRetainNonConfigurationState(){
        return MT;
    }
}
