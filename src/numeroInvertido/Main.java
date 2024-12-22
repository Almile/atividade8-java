package numeroInvertido;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scan.nextInt();

        int numeroInvertido = 0;

        while (n != 0) {
            int digito = n % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            n /= 10;
        }

        System.out.println("O número invertido é: " + numeroInvertido);
    }
}
