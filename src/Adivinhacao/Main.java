package Adivinhacao;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroEscolhido = random.nextInt(50) + 1;
        int palpite = 0;

        System.out.println("Tente adivinhar o número escolhido. ");
        System.out.println("O número está entre 1 e 50.");

        while (palpite != numeroEscolhido) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou o número!");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }
    }
}
