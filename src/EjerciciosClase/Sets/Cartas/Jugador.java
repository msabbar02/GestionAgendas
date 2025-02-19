package EjerciciosClase.Sets.Cartas;
import java.util.ArrayList;
import java.util.HashSet;

public class Jugador {
    private String nombre;
    private ArrayList<Integer> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getMano() {
        return mano;
    }

    public void recibirCarta( int carta){
        mano.add(carta);
    }

    public void descartarCartas(ArrayList<Integer> cartas){
        mano.removeAll(cartas);
    }

    public boolean tieneCartasRepetidas(){
        HashSet<Integer> manoSet = new HashSet<>(mano);
        return manoSet.size() < mano.size();
    }
}
