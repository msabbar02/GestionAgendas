package Estudiantes;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.agregar();
        gestor.mostrar();
        System.out.println("**********************************************************");
        System.out.println();
        gestor.elimnarMenorDe(5);
        gestor.mostrar();
        System.out.println("************************************************************");
        System.out.println(String.format("%30s %.2f", "nota media de clase:", gestor.notaMedia()));
        System.out.println("**********************************************************");
        System.out.println();
        gestor.ordenar();


    }


}
