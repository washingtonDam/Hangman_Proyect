import java.util.Scanner;

public class AdivinarLetra {
    private static final Scanner scanner = new Scanner(System.in);

    public static char adivinarLetra(String letrasUsadas) {
        char letra;
        while (true) {
            System.out.print("Introduce una letra: ");
            letra = scanner.next().toLowerCase().charAt(0);

            if (letrasUsadas.indexOf(letra) >= 0) {
                System.out.println("Ya has usado esa letra. Intenta otra.");
            } else {
                return letra;
            }
        }
    }
}
