package ec.demos;

public class Calculadora extends Operaciones {

	public void Modulo() {
		
		int respuesta= getValues1() % getValues2();
		System.out.println("Modulo: " + respuesta);
	}
}