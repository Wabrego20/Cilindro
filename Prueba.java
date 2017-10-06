package cilindro;

public class Prueba {

	public static void main(String[] args) {
		
		Cilindro cilindro = new Cilindro(2,4);
		Esfera esfera = new Esfera(cilindro);
		
		System.out.println("El radio del Cilindro es: "+cilindro.dameRadio()+" cm");
		System.out.println("La altura del Cilindro es: "+cilindro.dameAltura()+" cm\n");
		
		System.out.println(String.format("El area del Cilindro es: %.2f cm²", cilindro.calAreaCilindro()));
		System.out.println(String.format("El volumen del Cilindro es: %.2f cm³ \n", cilindro.calVolCilindro()));
		
		System.out.println(String.format("El area de la Esfera es: %.2f cm²", esfera.dameAreaEsfera()));
		System.out.println(String.format("El volumen de la Esfera es: %.2f cm³", esfera.dameVolEsfera()));
		}
}
