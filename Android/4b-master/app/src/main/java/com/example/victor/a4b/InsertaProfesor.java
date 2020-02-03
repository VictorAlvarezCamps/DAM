package com.example.victor.a4b;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertaProfesor extends AppCompatActivity {

    private MyDBAdapter dbAdapter;

    EditText NombreProfesor;
    EditText EdadProfesor;
    EditText CicloProfesor;
    EditText CursoProfesorTutor;
    EditText DespachoTutor;
    Button Añadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserta_profesor);

        NombreProfesor = (EditText)findViewById(R.id.nombreProfesor);
        EdadProfesor = (EditText)findViewById(R.id.edadProfesor);
        CicloProfesor = (EditText)findViewById(R.id.cicloProfesor);
        CursoProfesorTutor = (EditText)findViewById(R.id.cursoProfesorTutor);
        DespachoTutor = (EditText)findViewById(R.id.despachoTutor);
        Añadir = (Button)findViewById(R.id.añadir);

        Añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarProfesor();
            }
        });
    }

    public void insertarProfesor(){

        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        dbAdapter.insertarProfesor(NombreProfesor.getText().toString(),Integer.valueOf(EdadProfesor.getText().toString()),CicloProfesor.getText().toString(),CursoProfesorTutor.getText().toString(),DespachoTutor.getText().toString());
    }
}