package Fibonacci;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantose números da sequência de Fibonacci deseja exibir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
        } else {
            System.out.println("Sequência de Fibonacci com " + n + " números:");

            long primeiro = 0, segundo = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(primeiro + " ");

                long proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }
    }
}
