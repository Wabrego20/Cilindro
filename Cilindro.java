package cilindro;

public class Cilindro {
	public double radio, altura, areaCilindro, volCilindro;
	
	public Cilindro (double radio, double altura) {
		this.radio=radio;
		this.altura=altura;
	}
	public double dameAltura() {
		return altura;
	}
	public double dameRadio() {
		return radio;
	}
	public double calAreaCilindro() {
		return areaCilindro = 2 * Math.PI * radio * (altura + radio);
	}
	public double calVolCilindro() {
		return volCilindro = areaCilindro * altura;
	}
}
