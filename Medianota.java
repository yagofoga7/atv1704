package atv1704;

import java.util.Scanner;

public class Medianota {

	public static void main(String[] args) {
		double num,media,soma=0,resultado;
		Scanner ler = new Scanner (System.in);

		for (double i=0; i<=4; i++) {
			System.out.println("Informe a nota");
			num= ler.nextDouble();
			soma += num;

			media= soma/5;
			System.out.println("sua media é" + media);
		}

	}

}
