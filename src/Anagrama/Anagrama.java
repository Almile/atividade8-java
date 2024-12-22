package Anagrama;

public class Anagrama {
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();

        for (int i = 0; i < palavra1.length(); i++) {
            boolean encontrada = false;

            for (int j = 0; j < palavra2.length(); j++) {
                if (palavra1.charAt(i) == palavra2.charAt(j)) {
                    encontrada = true;
                    palavra2 = palavra2.substring(0, j) + palavra2.substring(j + 1); // Remover a letra encontrada
                    break;
                }
            }
            if (!encontrada) {
                return false;
            }
        }
        return true;
    }
}
