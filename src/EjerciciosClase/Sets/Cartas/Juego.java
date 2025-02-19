package EjerciciosClase.Sets.Cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Integer> baraja;
    Random random;

    public Juego(ArrayList<String> nombreJugadores){
        jugadores = new ArrayList<>();
        baraja = new ArrayList<>();
        random = new Random();


        for (String nombre : nombreJugadores){
            jugadores.add(new Jugador(nombre));
        }

        for (int i = 0; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                baraja.add(i);
            }
        }

        Collections.shuffle(baraja);
    }

    public void inciarJuego(){
        for (Jugador jugador : jugadores){
            for (int i = 0; i < 6; i++) {
                jugador.recibirCarta(tomarCartas());
            }
        }
    }

    private int tomarCartas() {
        return baraja.remove(random.nextInt(baraja.size()));
    }

    public void jugarRonda() {
        System.out.println("\n--- Nueva Ronda ---");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - Mano: " + jugador.getMano());
            // Simulación de descarte aleatorio de 1 o 2 cartas
            ArrayList<Integer> cartasADescartar = new ArrayList<>();
            int cantidadADescartar = random.nextInt(2) + 1;

            for (int i = 0; i < cantidadADescartar; i++) {
                if (!jugador.getMano().isEmpty()) {
                    int carta = jugador.getMano().get(random.nextInt(jugador.getMano().size()));
                    cartasADescartar.add(carta);
                    baraja.add(carta); // Regresa la carta a la baraja
                }
            }

            // Descartar cartas seleccionadas
            jugador.descartarCartas(cartasADescartar);

            // Reemplazar cartas descartadas
            for (int i = 0; i < cantidadADescartar; i++) {
                jugador.recibirCarta(tomarCartas());
            }
        }
    }

    // Verifica quién ha quedado eliminado y determina el ganador
    public void verificarGanador() {
        ArrayList<Jugador> eliminados = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            if (jugador.tieneCartasRepetidas()) {
                eliminados.add(jugador);
            }
        }

        // Eliminar jugadores con cartas repetidas
        jugadores.removeAll(eliminados);

        // Mostrar los resultados
        if (jugadores.size() == 1) {
            System.out.println("\nEl ganador es: " + jugadores.get(0).getNombre());
        } else if (jugadores.isEmpty()) {
            System.out.println("\nTodos los jugadores han sido eliminados.");
        } else {
            System.out.println("\nJugadores restantes:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " - Mano: " + jugador.getMano());
            }
        }
    }
}
