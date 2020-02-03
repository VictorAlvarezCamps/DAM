package com.example.a2dam.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Calabaza> Calabazas = new ArrayList<>();

    RecyclerView rv;
    GridLayoutManager rvLM;
    Adaptador ACalabaza;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0;i<30;i++){
            Calabazas.add(new Calabaza(R.drawable.pumpkin_angry,"Lunes","Primer dia de la semana"));
            Calabazas.add(new Calabaza(R.drawable.pumpkin_happy,"Martes","Segundo dia de la semana"));
            Calabazas.add(new Calabaza(R.drawable.pumpkin_amazed,"Miércoles","Tercer dia de la semana"));
            Calabazas.add(new Calabaza(R.drawable.pumpkin_winking,"Jueves","Cuarto dia de la semana"));
            Calabazas.add(new Calabaza(R.drawable.pumpkin_in_love,"Viernes","Quinto dia de la semana"));
        }

        rv= (RecyclerView)findViewById(R.id.elMeuRecyclerView);

        rvLM = new GridLayoutManager(this,2);

        rv.setLayoutManager(rvLM);

        ACalabaza = new Adaptador(Calabazas);

        rv.setAdapter(ACalabaza);
    }
}
