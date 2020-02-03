package com.example.a2dam.a3b;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.a2dam.a3b.R;

public class MainActivity extends AppCompatActivity {

    EditText textNombre;
    EditText textDNI;
    EditText textFecha;
    RadioGroup Sexo;
    Button guardar;
    Button recuperar;
    boolean sexo;
    String nombre;
    String DNI;
    String Fecha;
    boolean radioSexo;

    public static final String PREFS = "My preferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNombre = (EditText) findViewById(R.id.editNombre);
        textDNI = (EditText) findViewById(R.id.editDNI);
        textFecha = (EditText) findViewById(R.id.editFecha);
        Sexo = (RadioGroup) findViewById(R.id.Sexo);
        guardar = (Button) findViewById(R.id.guardar);
        recuperar = (Button) findViewById(R.id.recuperar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences mySharedPreferences = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);

                SharedPreferences.Editor editor = mySharedPreferences.edit();

                editor.putString("Nombre",textNombre.getText().toString());
                editor.putString("DNI",textDNI.getText().toString());
                editor.putString("Fecha",textFecha.getText().toString());
                editor.putBoolean("Sexo",sexo);


                editor.commit();

            }
        });

        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences mySharedPreferences = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);

                nombre = mySharedPreferences.getString("Nombre","");
                DNI = mySharedPreferences.getString("DNI","");
                Fecha = mySharedPreferences.getString("Fecha","");
                radioSexo = mySharedPreferences.getBoolean("Sexo",false);

                Bundle b = new Bundle();
                b.putString("",nombre);
                b.putString("",DNI);
                b.putString("",Fecha);
                b.putBoolean("false", radioSexo);
                Intent i = new Intent();
                i.putExtras(b);
                startActivityForResult(i,1);

            }
        });
    }

    public void onRadioButtonClicked(View view) {
        sexo = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.hombre:
                sexo = true;
                break;

            case R.id.mujer:
                sexo = false;
                break;
        }
    }

}
