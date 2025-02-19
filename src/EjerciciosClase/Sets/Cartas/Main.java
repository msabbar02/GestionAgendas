package EjerciciosClase.Sets.Cartas;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            // Crear una lista de nombres de jugadores
            ArrayList<String> nombresJugadores = new ArrayList<>(Arrays.asList("Ana", "Luis", "Carlos"));

            // Crear el juego con los jugadores
            Juego juego = new Juego(nombresJugadores);

            // Iniciar el juego
            juego.inciarJuego();

            // Jugar 3 rondas
            for (int ronda = 1; ronda <= 3; ronda++) {
                System.out.println("\n--- Ronda " + ronda + " ---");
                juego.jugarRonda();
            }

            // Verificar el ganador al final de las rondas
            juego.verificarGanador();
        }

    }


