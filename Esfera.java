package cilindro;
import cilindro.Cilindro;
public class Esfera {
	public double volumenEsfera, areaEsfera;
	
	public Esfera(Cilindro cilindro) {
	}
	public double dameAreaEsfera() {
		return areaEsfera = 4 * Math.PI * Math.pow(2,2) ;
	}
	public double dameVolEsfera() {
		return volumenEsfera = (4/3) * Math.PI * Math.pow(2, 3);
	}

}
