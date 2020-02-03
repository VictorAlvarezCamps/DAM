package com.example.victor.a4b;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertaAlumno extends AppCompatActivity {

    private MyDBAdapter dbAdapter;

    EditText NombreAlumno;
    EditText EdadAlumno;
    EditText CicloAlumno;
    EditText CursoAlumno;
    EditText NotaMedia;
    Button añadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserta_alumnos);

        NombreAlumno = (EditText) findViewById(R.id.nombreAlumno);
        EdadAlumno = (EditText) findViewById(R.id.edadAlumno);
        CicloAlumno = (EditText) findViewById(R.id.cicloAlumno);
        CursoAlumno = (EditText) findViewById(R.id.cursoAlumno);
        NotaMedia = (EditText) findViewById(R.id.NotaMediaAlumno);
        añadir = (Button)findViewById(R.id.anyadir);

        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarAlumno();
            }
        });
    }

    public void insertarAlumno(){

        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        /*Insertamos Alumno*/

        dbAdapter.insertarAlumno(NombreAlumno.getText().toString(),Integer.valueOf(EdadAlumno.getText().toString()),CicloAlumno.getText().toString(),CursoAlumno.getText().toString(),Integer.valueOf(NotaMedia.getText().toString()));
    }
}