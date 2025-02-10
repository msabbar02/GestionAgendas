package Biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Libro> libros;
    Scanner sc = new Scanner(System.in);

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }
    /*
    * agregar libro usando clase scanner
    * antes verifica si no existe libro con el mismo nombre
    * */
    public void agregarLibro(){
        System.out.print("Titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Nombre del autor: ");
        String autor = sc.nextLine();
        System.out.print("Año de publicacion: ");
        int ano = sc.nextInt();
        sc.nextLine();

        for (Libro libro: libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("este libro ya existe.");
            }
        }
        libros.add(new Libro(titulo,autor,ano));
        System.out.println("libro agregado con exito.");
    }


    /*
    * metodo para buscar un libro con su título
    * */

    public Libro buscarPorTiulo(){
        System.out.print("Titulo del libro: ");
        String titulo = sc.nextLine();
        for (Libro libro : libros){
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        System.out.println("no existe libro con ese titulo");
        return null;
    }

    /*
     * metodo para buscar un libro con su título
     * */

    public ArrayList<Libro> buscarPorAutor(){
        System.out.print("Autor del libro: ");
        String autor = sc.nextLine();
        ArrayList<Libro> libroArrayList = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getAutor().equalsIgnoreCase(autor)){
               libroArrayList.add(libro);
            }
        }
        if (libroArrayList.isEmpty()){
            System.out.println("No existe un libro de ese autor.");
            return null;
        }
        return libroArrayList;
    }


    /*
    * modificar el año de publicacion de un libro
    * */


    public void actualizarLibro(){
        System.out.print("Título del libro que quieres actualizar: ");
        String titulo = sc.nextLine();
        boolean encontrado = false;

        for (Libro libro : libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.print("Nuevo año de publicacion: ");
                int ano = sc.nextInt();
                sc.nextLine();
                libro.setAnyoPublicacion(ano);
                System.out.println("Año actualizado con exito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("no hay libro con ese titulo");
        }
    }


    /*
    * Elimina un libro de la colección.
    * */

    public void eliminarLibro(){
        System.out.print("Titulo del libro : ");
        String titulo = sc.nextLine();
        Iterator<Libro> libroIterator = libros.iterator();
        boolean eliminado = false;
        while (libroIterator.hasNext()){
            Libro libro = libroIterator.next();
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                libroIterator.remove();
                eliminado = true;
                break;
            }
        }

        if (eliminado){
            System.out.println("Libro eliminado.");
        }else{
            System.out.println("no existe libro con ese titulo.");
        }
    }


    /*
     * mostrar todos los libros
     * */

    public void mostrar(){
        if (libros.isEmpty()){
            System.out.println("la biblioteca esta vacia.");
            return;
        }
        for (Libro libro : libros){
            System.out.println(libro);
        }
    }
}
