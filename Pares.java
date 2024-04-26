package atv1704;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		int num1;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o valor: ");
        num1 = ler.nextInt();
        
        for (int i =num1; i<=num1; i++ ) {
        	if (num1 % 2== 0)
        		System.out.println("O numero é par");
        	else
        		System.out.println("O numero é impar");
        	
        	
        }
        ler.close();
	}

}
