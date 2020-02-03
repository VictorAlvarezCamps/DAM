package com.example.victor.a4b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private MyDBAdapter dbAdapter;
    Button insertarAlumno;
    Button insertarProfesor;
    Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        insertarAlumno = (Button)findViewById(R.id.insertarAlumno);
        insertarProfesor = (Button)findViewById(R.id.insertarProfesor);
        buscar = (Button) findViewById(R.id.buscar);
        TextView textView = (TextView) this.findViewById(R.id.textView);
        TextView textView2 = (TextView) this.findViewById(R.id.textView2);

        insertarAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),InsertaAlumno.class);
                startActivity(i);
            }
        });

        insertarProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),InsertaProfesor.class);
                startActivity(i);
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), BusquedaDB.class);
                startActivity(i);
            }
        });

    }
}
