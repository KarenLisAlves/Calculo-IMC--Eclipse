package imc;

public class Imc {
	
	private double peso;
	private double altura;
	private double imc;

	
	public Imc(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calculaImc() {
		this.imc = ( (this.peso) / (this.altura * this.altura));
	}
	
	public String classificacao() {
		this.calculaImc();
		
		if (this.imc < 18.5) return "Magresa";
		if (this.imc < 24.9) return "Normal";
		if (this.imc < 29.9) return "Sobrepeso";
		if (this.imc < 39.9) return "Obesidade";
		return "Obesidade grave";
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the imc
	 */
	public double getImc() {
		return imc;
	}

	/**
	 * @param imc the imc to set
	 */
	public void setImc(double imc) {
		this.imc = imc;
	}
	

	
}
