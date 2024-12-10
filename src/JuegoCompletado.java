public class JuegoCompletado {
    public static boolean juegoCompletado(String palabra, String letrasAdivinadas ) {
        for (char letra : letrasAdivinadas.toCharArray()) {
            if (palabra.indexOf(letra) == -1) {
                return false;
            }
        }
        return true;
    }
}
