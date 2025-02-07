package Agenda;

import java.util.Scanner;

public class Agenda{
    private String descripcion ;
    private String nombre;


    public Agenda(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return
                "\u001B[32mNombre :\u001B[0m" + nombre +
                "\u001B[33m Descripcion:\u001B[0m " + descripcion ;

    }
}
