package com.example.victor.recyclerviewrepaso;

/**
 * Created by Victor on 01/02/2017.
 */

public class Profesor {

    String nombre;
    String asignatura;
    String telefono;

    public Profesor(String nombre, String apellidos,String telefono){
        this.nombre = nombre;
        this.asignatura = apellidos;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getasignatura() {
        return asignatura;
    }

    public void setasignatura(String apellidos) {
        this.asignatura = asignatura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
