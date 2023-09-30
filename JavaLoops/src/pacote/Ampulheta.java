package pacote;

import java.util.Scanner;

public class Ampulheta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da ampulheta (deve ser ímpar): ");
        int numeroDeLinhas = scanner.nextInt();

        if (numeroDeLinhas % 2 == 0) {
            System.out.println("O número de linhas deve ser ímpar.");
            return;
        }

        int metade = numeroDeLinhas / 2;

        for (int i = 1; i <= numeroDeLinhas; i++) {
            int asteriscos = Math.abs(i - metade);
            int espacos = (numeroDeLinhas - asteriscos * 2) / 2;

            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= asteriscos * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}