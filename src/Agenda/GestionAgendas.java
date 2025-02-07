package Agenda;

import java.util.ArrayList;
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
    * añadir un nota nueve si existe
    * con la clase Scanner
    * */
     public void addNota(){
         System.out.println("Introduce el nombre de la nota");
         String nombre = sc.nextLine();
         System.out.println("Ahora la descripcion:");
         String desc = sc.nextLine();

         boolean existe = false;
         for (Agenda nota : agenda) {
             if (nota.getNombre().equals(nombre)) {
                 existe = true;
                 break;
             }
         }

         if (existe) {
             System.out.println("Este nota ya existe.");
         } else {
             agenda.add(new Agenda(nombre, desc));
             System.out.println("Listo (:");
         }
     }

    /*
    * eliminar un nota atraves de su nombre como parametro de entrada
    * luego resta el index de la arraylist
    *
    * */
     public void eliminarNota(){
         System.out.println("nombre de la nota que queries eliminar:");
         String nombreAntiguo = sc.nextLine();
         for (int i = 0; i < agenda.size(); i++) {
             if (agenda.get(i).getNombre().equals(nombreAntiguo)) {
                 agenda.remove(i);
                 i--;
                 System.out.println("listo (:");
             }else {
                 System.out.println("este nombre no existe.");
             }
         }
     }

     /*
     * modificar el nombre del la nota usando clase Scanner
     * si no eiste te saldra mensaje de error
     * */
     public void modificarNombre(){
         System.out.println("nombre de la nota que queries modificar:");
         String nombreAntiguo = sc.nextLine();
         for (int i = 0; i < agenda.size(); i++) {
             if (agenda.get(i).getNombre().equals(nombreAntiguo)){
                 System.out.print("introduce el nombre nuevo:");
                 String nombreNueve = sc.nextLine();
                 agenda.get(i).setNombre(nombreNueve);
                 System.out.println("listo (:");
             }else {
                 System.out.println("este nombre no existe.");
             }
         }
     }

     /*
     * modificacion de la decrpcion del nota usando su nombre para buscarla
     * */
    public void modificarDescripcon(){
        System.out.println("nombre de la nota que queries modificar:");
        String nombreAntiguo =sc.nextLine();
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equals(nombreAntiguo)){
                System.out.print("ahora la descrpcion que quieres:");
                String nombreNueve = sc.nextLine();
                agenda.get(i).setDescripcion(nombreNueve);
                System.out.println("listo (:");
            }else {
                System.out.println("este nombre no existe.");
            }
        }
    }

    public void mostrar() {
        if (agenda.isEmpty()){
            System.out.println("no hay notaas en la agenda");
        }else {
            for (Agenda agenda1 : agenda){
                System.out.println(agenda1);
            }
        }

    }


}
