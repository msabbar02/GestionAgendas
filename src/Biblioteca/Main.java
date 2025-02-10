package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.leerFichero();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n📚 **MENÚ BIBLIOTECA**");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libros por autor");
            System.out.println("4. Actualizar año de publicación");
            System.out.println("5. Eliminar libro");
            System.out.println("6. Mostrar todos los libros");
            System.out.println("7. Ordenar Por ano");
            System.out.println("8. Ordenar Por titulo");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");

            while (!sc.hasNextInt()) {  // Evita errores si el usuario ingresa texto en vez de número
                System.out.println("Por favor, ingresa un número.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    biblioteca.agregarLibro();
                    break;
                case 2:
                    Libro libro = biblioteca.buscarPorTiulo();
                    if (libro != null) {
                        System.out.println("📖 Libro encontrado: " + libro);
                    }
                    break;
                case 3:
                    System.out.println("📚 Libros encontrados:");
                    var librosAutor = biblioteca.buscarPorAutor();
                    if (librosAutor != null) {
                        for (Libro l : librosAutor) {
                            System.out.println(l);
                        }
                    }
                    break;
                case 4:
                    biblioteca.actualizarLibro();
                    break;
                case 5:
                    biblioteca.eliminarLibro();
                    break;
                case 6:
                    biblioteca.mostrar();
                    break;
                case 7:
                    biblioteca.ordenarPorAnyo();
                    break;
                case 8:
                    biblioteca.ordenarPorTitulo();
                    break;
                case 9:
                    System.out.println("¡Saliendo del sistema de biblioteca! 👋");
                    break;
                default:
                    System.out.println("⚠ Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 9);

        sc.close();
    }
}
