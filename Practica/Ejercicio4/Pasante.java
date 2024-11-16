package ar.edu.unlp.info.oo2.Ejercicio4;

public class Pasante extends Empleado{
	
	private int cantExamenes;
	
	
	public Pasante (int cantE) {
		super();
		this.cantExamenes=cantE;
	}
	
	public double getSueldoBasico() {
		return 20000;
	}
	
	public double getSueldoAdicional() {
		return this.cantExamenes*2000;
	}

}
