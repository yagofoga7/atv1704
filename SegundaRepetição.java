package atv1704;

import java.util.Scanner;

public class SegundaRepetição {

	public static void main(String[] args) {
		int numero, resultado;

		Scanner ler = new Scanner (System.in);

		System.out.println("Informe o numero para ver a tabuada:");
		numero = ler.nextInt();

		for(int i =1; i<=10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado + "\n");

		}
		ler.close();
	}
}