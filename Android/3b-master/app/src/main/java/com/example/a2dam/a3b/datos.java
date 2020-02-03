package com.example.a2dam.a3b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datos extends AppCompatActivity {


    TextView nombreResult;
    TextView DNI_Result;
    TextView FechaResult;
    TextView SexoResult;


    String nombre;
    String DNI;
    String Fecha;
    boolean sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        nombreResult = (TextView) findViewById(R.id.resultNombre);
        DNI_Result = (TextView) findViewById(R.id.resultDNI);
        FechaResult = (TextView)findViewById(R.id.resultFecha);
        SexoResult = (TextView) findViewById(R.id.resultSexo);

        nombreResult.setText(nombre);
        DNI_Result.setText(DNI);
        FechaResult.setText(Fecha);
        compruebaSexo();

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Intent i = getIntent();
                nombre = i.getStringExtra("Nombre");
                DNI = i.getStringExtra("DNI");
                Fecha = i.getStringExtra("Fecha");
                sexo = i.getBooleanExtra("radioSexo",false);
            }
        }
    }

    public void compruebaSexo(){
        if(sexo == true){
            SexoResult.setText("Hombre");
        }else{
            SexoResult.setText("Mujer");
        }
    }

}
