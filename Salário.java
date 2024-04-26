package atv1704;

import java.util.Scanner;

public class Salário {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int funcio,sala=0,mediasala=0,sal;;
		
		System.out.println("Quantos funcionários tem na empresa? ");
		funcio = ler.nextInt();
		
		for (int i=1; i<funcio; i++) {
			System.out.println("Informe o salário dos fincionários: ");
			sal = ler.nextInt();
			sala+= sal;
		}
        
		mediasala= sala/funcio;
		System.out.println("A média salaria da empresa é R" + mediasala + "$");
		
		ler.close();
	}

}
