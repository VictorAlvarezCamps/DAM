package com.example.victor.a4b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class BusquedaDB extends AppCompatActivity {

    Button profesores;
    Button alumnos;
    Button todos;
    Button ciclo;
    Button curso;
    TextView texto;

    MyDBAdapter MDBA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_db);

        MDBA = new MyDBAdapter(this);

        profesores = (Button) findViewById(R.id.profesores);
        alumnos = (Button) findViewById(R.id.alumnos);
        todos = (Button) findViewById(R.id.todo);
        ciclo = (Button) findViewById(R.id.ciclo);
        curso = (Button) findViewById(R.id.curso);
        texto = (TextView) findViewById(R.id.texto);


        /*Método para buscar todos los profesores*/

        profesores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> Profesor = MDBA.recuperarProfesores();
                texto.setText(Profesor.get(0));
                texto.setText(Profesor.get(1));
            }
        });

        /*Método para buscar todos los alumnos*/

        alumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> Alumnos = MDBA.recuperarAlumnos();
                texto.setText(Alumnos.get(0));
                texto.setText(Alumnos.get(1));
            }
        });

        /*Método para buscar profesores y alumnos*/

        todos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> Colegio = MDBA.recuperarTodo();
                texto.setText(Colegio.get(0));
                texto.setText(Colegio.get(1));
            }
        });

        /*Método para buscar por ciclos*/

        ciclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> Ciclos = MDBA.recuperarPorCiclos();
                texto.setText(Ciclos.get(0));
                texto.setText(Ciclos.get(1));
            }
        });

        /*Metodo para buscar por cursos*/

        curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> Cursos = MDBA.recuperarPorCiclos();
                texto.setText(Cursos.get(0));
                texto.setText(Cursos.get(1));
            }
        });
    }
}
