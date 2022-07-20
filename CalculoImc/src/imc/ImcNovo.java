package imc;

public class ImcNovo extends Imc {

	public ImcNovo(double peso, double altura) {
		super(peso, altura);
	}
	

	//Define que necessariamente esse método está sobreescrevendo o método da classe superior.
	// Se trocar o nome da classe pai me obriga trocar tambem no nome das classes filhas
	@Override
	public String classificacao() {
		this.calculaImc();
		
		if (this.getImc() < 16) return "Magresa grave";
		if (this.getImc() < 17) return "Magresa moderada";
		if (this.getImc() < 18.5) return "Magresa leve";
		if (this.getImc() < 25) return "Saudável";
		if (this.getImc() < 30) return "Sobrepeso";
		if (this.getImc() < 35) return "Obesidade grau I";
		if (this.getImc() < 40) return "Obesidade grau II";
		return "Obesidade grau III";
	}
}
