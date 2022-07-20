import java.util.Scanner;

import imc.Imc;
import imc.ImcLeitura;
import imc.ImcNovo;

public class Principal {

	public static void main (String[] args) {
		
		Imc imc1 = new Imc (86, 1.77);
		System.out.println("A classifica��o IMC �: "+ imc1.classificacao());
		
		ImcNovo imc2 = new ImcNovo (65, 1.65);
		System.out.println("A classifica��o IMC �: "+ imc2.classificacao());
		
		ImcLeitura imc3 = new ImcLeitura();
		imc3.lerPeso();
		imc3.lerAltura();
		System.out.println("A classifica��o � " + imc3.classificacao());
	}
}
