package imc;

import java.util.Scanner;

public class ImcLeitura extends Imc {
	
	Scanner entrada;

	public ImcLeitura(double peso, double altura) {
		super(peso, altura);
		 entrada = new Scanner(System.in);
	}
	
	public ImcLeitura() {
		super(80, 1.8);
		entrada = new Scanner(System.in);
	}
	
	public Double lerDouble(String texto) {
		
		boolean continuarLeitura = true;
		double valor = 0;
		
		while(continuarLeitura) {
		
		System.out.println(texto);
		
		try {
			valor = Double.parseDouble(entrada.nextLine());
			continuarLeitura = false;
		}catch(NumberFormatException e) {
			System.out.println("Entrada com valor inálido");
		}
	}
		return valor;
	}
	
	public void lerPeso() {
		this.setPeso(this.lerDouble("Entre com seu Peso"));
//		System.out.println("Entre com seu Peso");
//		this.setPeso(entrada.nextDouble());
	}
	
	public void lerAltura() {
		System.out.println("Entre com sua Altura");
		this.setAltura(entrada.nextDouble());
	}

	
}
