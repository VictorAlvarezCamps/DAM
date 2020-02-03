package com.example.victor.recyclerviewrepaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    GridLayoutManager rvLM;
    AdaptadorRecyclerViewProfesor aRVprofesor;

    ArrayList<Profesor>profesores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0;i<5;i++) {

            profesores.add(new Profesor("Manel", "Viel", "1122334455"));
            profesores.add(new Profesor("Sr", "Cuesta", "1122334455"));
            profesores.add(new Profesor("Batista", "Viel", "1122334455"));

        }

        rv = (RecyclerView)findViewById(R.id.elMeuRecyclerView);
        rvLM = new GridLayoutManager(this, 2);
        rv.setLayoutManager(rvLM);
        aRVprofesor = new AdaptadorRecyclerViewProfesor(profesores);
        rv.setAdapter(aRVprofesor);
    }
}
