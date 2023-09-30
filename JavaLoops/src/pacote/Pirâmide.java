package pacote;

import java.util.Scanner;

public class Pirâmide {
	  public static void main(String[] args) {
		  
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o número de linhas da pirâmide: ");
	        int numeroDeLinhas = scanner.nextInt();
	        
	        for (int i = numeroDeLinhas; i >= 1; i--) {
	            for (int j = 1; j <= numeroDeLinhas - i; j++) {
	                System.out.print(" ");
	            }
	            
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}


