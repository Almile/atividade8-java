package Anagrama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anagrama anagrama = new Anagrama();

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (anagrama.saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas.");
        } else {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são anagramas.");
        }
    }
}
