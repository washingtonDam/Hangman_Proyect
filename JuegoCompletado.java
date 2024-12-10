
public class JuegoCompletado {
    public static boolean juegoCompletado(String palabras, String letrasAdivinadas) {
        for (char letra : letrasAdivinadas.toCharArray()) {
            if (palabras.indexOf(letra) == -1) {
                return false;
            }
        }
        return true;
    }
}
