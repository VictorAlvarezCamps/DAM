package com.example.a2dam.a4c;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDBAdapter {

    // Definiciones y constantes
    private static final String DATABASE_NAME = "dbdiscos.db";
    private static final String DATABASE_TABLEAlumnos = "Alumnos";
    private static final String DATABASE_TABLEProfesor = "Profesor";
    private static final int DATABASE_VERSION = 1;

    /*Alumno*/

    private static final String NombreAlumno = "nombreAlumno";
    private static final String EdadAlumno = "edadAlumno";
    private static final String CicloAlumno = "cicloAlumno";
    private static final String CursoAlumno = "cursoAlumno";
    private static final String NotaMediaAlumno = "notaMediaAlumno";

    /*Profesor*/

    private static final String NombreProfesor = "nombreProfesor";
    private static final String EdadProfesor = "edadProfesor";
    private static final String CicloProfesor = "cicloProfesor";
    private static final String CursoProfesorTutor = "cursoProfesorTutor";
    private static final String DespachoProfesor = "despachoProfesor";

    /* Consultas Alumno*/

    private static final String DATABASE_CREATEAlumno = "CREATE TABLE "+DATABASE_TABLEAlumnos+" (_id integer primary key autoincrement, nombreAlumno text, edadAlumno integer, cicloAlumno text, cursoAlumno text, notaMediaAlumno integer);";
    private static final String DATABASE_DROP_Alumno= "DROP TABLE IF EXISTS "+DATABASE_TABLEAlumnos+";";

    /* Consultas Profesor*/

    private static final String DATABASE_CREATEProfesor = "CREATE TABLE "+DATABASE_TABLEProfesor+" (_id integer primary key autoincrement, nombreProfesor text, edadProfesor integer, cicloProfesor text, cursoProfesorTutor text, despachoProfesor text);";
    private static final String DATABASE_DROP_Profesor= "DROP TABLE IF EXISTS "+DATABASE_TABLEProfesor+";";

    // Contexto de la aplicación que usa la base de datos
    private final Context context;
    // Clase SQLiteOpenHelper para crear/actualizar la base de datos
    private MyDbHelper dbHelper;
    // Instancia de la base de datos
    private SQLiteDatabase db;

    public MyDBAdapter (Context c){
        context = c;
        dbHelper = new MyDbHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
        //OJO open();
    }

    public void open(){

        try{
            db = dbHelper.getWritableDatabase();
        }catch(SQLiteException e){
            db = dbHelper.getReadableDatabase();
        }

    }

    /*Insertamos alumno*/

    public void insertarAlumno(String nombreAlumno, int edadAlumno, String cicloAlumno, String cursoAlumno, int notaMediaAlumno){

        ContentValues newValues = new ContentValues();

        newValues.put(NombreAlumno,nombreAlumno);
        newValues.put(EdadAlumno,edadAlumno);
        newValues.put(CicloAlumno,cicloAlumno);
        newValues.put(CursoAlumno,cursoAlumno);
        newValues.put(NotaMediaAlumno,notaMediaAlumno);
        db.insert(DATABASE_TABLEAlumnos,null,newValues);
    }

    /*Insertamos profesor*/

    public void insertarProfesor(String nombreProfesor, int edadProfesor, String cicloProfesor, String cursoProfesorTutor, String despachoProfesor){
        ContentValues newValues = new ContentValues();

        newValues.put(NombreProfesor,nombreProfesor);
        newValues.put(EdadProfesor,edadProfesor);
        newValues.put(CicloProfesor,cicloProfesor);
        newValues.put(CursoProfesorTutor,cursoProfesorTutor);
        newValues.put(DespachoProfesor,despachoProfesor);
        db.insert(DATABASE_TABLEProfesor,null,newValues);
    }

    private static class MyDbHelper extends SQLiteOpenHelper {

        public MyDbHelper (Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
            super(context,name,factory,version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DATABASE_CREATEAlumno);
            db.execSQL(DATABASE_CREATEProfesor);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(DATABASE_DROP_Alumno);
            db.execSQL(DATABASE_DROP_Profesor);
            onCreate(db);
        }

    }
}