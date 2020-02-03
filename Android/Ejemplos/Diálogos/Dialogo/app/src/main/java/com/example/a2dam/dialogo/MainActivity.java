package com.example.a2dam.dialogo;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_contador;
    Button contador;
    String colors [] = {"RED","BLUE","GREEN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_contador = (TextView) findViewById(R.id.btn_contador);

        contador = (Button) findViewById(R.id.contador);

        contador.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int contador = 0;

                contador = contador + 1;

                if(contador % 5 == 0){

                    btn_contador.setText(String.valueOf(contador));

                    AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

                    builder.setMessage("Mensaje de prueba").setTitle("Titulo del dialogo");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int id) {


                        }

                    });

                    builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int id) {

                            dialog.cancel();

                        }

                    });

                    AlertDialog dialog = builder.create();

                        dialog.show();

                }
            }
        });
    }
}
