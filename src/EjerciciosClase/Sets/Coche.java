package EjerciciosClase.Sets;

public class Coche {
    private String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "matricula: " + matricula ;
    }
}
