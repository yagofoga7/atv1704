package atv1704;

import java.util.Scanner;

public class Somainteiros {

	public static void main(String[] args) {
		double num,inte,soma=0,resultado;
		Scanner ler = new Scanner (System.in);

		for (double i=0; i<=9; i++ ) {
			System.out.println("Digite o numero: ");
			num= ler.nextDouble();
			soma += num;
		}
			inte =soma;
			System.out.println("A soma é:" + inte);
			ler.close();
			if (soma % 2 == 0)
				System.out.println("O numero é par");
			else
				System.out.println("O numero é impar");
		

	}

}
