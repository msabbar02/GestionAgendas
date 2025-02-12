package EjerciciosClase;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre,int edad) {
        this.edad = edad;
        this.nota = (int)(Math.random()*10)+1;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%-30s | %-30d |%-10.2f",nombre,edad,nota);
    }
}
