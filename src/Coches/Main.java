package Coches;

public class Main {
    public static void main(String[] args) {
        GestorCoches gestorCoches = new GestorCoches();
        gestorCoches.add();
        gestorCoches.mostrar2();
        System.out.println();
        gestorCoches.recorrer();
        System.out.println(" coche set");
        gestorCoches.mostrar();
    }
}
