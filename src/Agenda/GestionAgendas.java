package Agenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionAgendas {
     ArrayList<Agenda> agenda  ;
     Scanner sc = new Scanner(System.in);

     public GestionAgendas(){
         agenda = new ArrayList<>();
     }

     /*
     * incializar el arraylist
     * */

    public void incializar(){
        System.out.println("+++++++++ Gestor Agendas+++++++++");

        while (true){

            System.out.println("1: añadir nota");
            System.out.println("2: eliminar nota");
            System.out.println("3: modificar nombre del nota");
            System.out.println("4: modificar descripcion del nota");
            System.out.println("5: mostrar");
            System.out.println("elige un opcion:");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1 -> addNota();
                case 2 -> eliminarNota();
                case 3 -> modificarNombre();
                case 4 -> modificarDescripcon();
                case 5 -> mostrar();
            }

        }

    }

    /*
    * añadir una nota nueve si existe
    * con la clase Scanner
    * */
     public void addNota(){
         System.out.print("Introduce el nombre de la nota: ");
         String nombre = sc.nextLine();
         System.out.print("Ahora la descripcion: ");
         String desc = sc.nextLine();

         boolean existe = false;
         for (Agenda nota : agenda) {
             if (nota.getNombre().equals(nombre)) {
                 existe = true;
                 break;
             }
         }

         if (existe) {
             System.out.println("\u001B[31mEste nota ya existe.\u001B[0m");
         } else {
             agenda.add(new Agenda(nombre, desc));
             System.out.println("\u001B[32mListo (:\u001B[0m");
         }
     }

    /*
    * eliminar una nota a través de su nombre como parametro de entrada
    * luego resta el index de la arraylist
    *
    * */
     public void eliminarNota(){
         System.out.print("nombre de la nota que queries eliminar: ");
         String nombreAntiguo = sc.nextLine();
         Iterator<Agenda> iterador = agenda.iterator();
         boolean eliminado = false;
         while (iterador.hasNext()){
             Agenda elemento = iterador.next();
             if (elemento.getNombre().equals(nombreAntiguo)) {
                 iterador.remove();
                 eliminado = true;
             }
         }

         if (eliminado){
             System.out.println("\u001B[32mListo (:\u001B[0m");
         }else {
             System.out.println("\u001B[31meste nombre no existe.\u001B[0m");
         }
     }

     /*
     * modificar el nombre de la nota usando clase Scanner
     * si no eiste te saldra mensaje de error
     * */
     public void modificarNombre(){
         System.out.println("nombre de la nota que queries modificar: ");
         String nombreAntiguo = sc.nextLine();
         for (int i = 0; i < agenda.size(); i++) {
             if (agenda.get(i).getNombre().equals(nombreAntiguo)){
                 System.out.print("introduce el nombre nuevo: ");
                 String nombreNueve = sc.nextLine();
                 agenda.get(i).setNombre(nombreNueve);
                 System.out.println("\u001B[32mListo (:\u001B[0m");
             }else {
                 System.out.println("\u001B[31meste nombre no existe.\u001B[0m");
             }
         }
     }

     /*
     * modificacion de la decrpcion de la nota usando su nombre para buscarla
     * */
    public void modificarDescripcon(){
        System.out.println("nombre de la nota que queries modificar: ");
        String nombreAntiguo =sc.nextLine();
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equals(nombreAntiguo)){
                System.out.print("ahora la descrpcion que quieres: ");
                String nombreNueve = sc.nextLine();
                agenda.get(i).setDescripcion(nombreNueve);
                System.out.println("\u001B[32mListo (:\u001B[0m");
            }else {
                System.out.println("\u001B[31meste nombre no existe.\u001B[0m");
            }
        }
    }

    public void mostrar() {
        if (agenda.isEmpty()){
            System.out.println("no hay notas en la agenda");
        }else {
            for (Agenda agenda1 : agenda){
                System.out.println(agenda1);
            }
        }
    }


}
