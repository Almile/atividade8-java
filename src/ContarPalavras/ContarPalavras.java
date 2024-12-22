package ContarPalavras;

public class ContarPalavras {
    public static int contaPalavras(String frase) {
        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
