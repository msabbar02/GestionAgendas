package EjerciciosClase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Gestor {

    ArrayList<Estudiante> estudiantes ;

    public Gestor(){
        estudiantes = new ArrayList<>();
    }
    public void agregar(){
        estudiantes.add(new Estudiante("Ana", 18));
        estudiantes.add(new Estudiante("Juan", 19));
        estudiantes.add(new Estudiante("Marta", 20));
        estudiantes.add(new Estudiante("Pedro", 21));
        estudiantes.add(new Estudiante("Lucía", 22));
        estudiantes.add(new Estudiante("Lucía", 24));
        estudiantes.add(new Estudiante("Lucía", 26));
        estudiantes.add(new Estudiante("Lucía", 25));
        estudiantes.add(new Estudiante("Lucía", 16));

    }

    public void elimnarMenorDe(int nota){
        Iterator<Estudiante> estudianteIterator = estudiantes.iterator();
        while (estudianteIterator.hasNext()){
            Estudiante estudiante = estudianteIterator.next();
            if (estudiante.getNota() < nota){
                estudianteIterator.remove();
            }
        }
    }

    public void mostrar(){
        System.out.printf("%-30s | %-30s | %-10s%n", "nombre", "edad", "nota");
        System.out.println("----------------------------------------------------------------------");
        for (Estudiante estudiante : estudiantes){
            System.out.println(estudiante);
        }
    }

    public double notaMedia(){
        double suma = 0;

        for (Estudiante estudiante : estudiantes){
            suma +=estudiante.getNota();
        }
        return (suma / estudiantes.size());
    }

    public void ordenar(){
        Collections.sort(estudiantes, Comparator.comparingDouble(Estudiante::getNota).reversed());
        System.out.println("                      lista ordenad por nota:");
        mostrar();
    }

}
