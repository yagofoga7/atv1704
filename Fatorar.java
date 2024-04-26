package atv1704;

import java.util.Scanner;

public class Fatorar {

	public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Digite um número");
       int num = ler.nextInt();
       
       int fato = 1;
       
       for (int i = 1; i <= num; i++) {
    	   fato *= i;
    	   
    	   
       }
	   System.out.println("O fatorial de " + num + " é: " + fato);
	   
	   ler.close();
	}
	

}
