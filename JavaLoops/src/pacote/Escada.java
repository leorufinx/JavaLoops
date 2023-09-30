package pacote;

import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas do desenho: ");
        int numeroDeLinhas = scanner.nextInt();
        
        for (int i = 1; i <= numeroDeLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}






