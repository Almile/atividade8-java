package ContarPalavras;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContarPalavras conte = new ContarPalavras();
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();

        int numeroDePalavras = conte.contaPalavras(frase);

        System.out.println("A frase contém " + numeroDePalavras + " palavras.");
    }
}
