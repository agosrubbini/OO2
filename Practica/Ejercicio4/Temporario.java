package ar.edu.unlp.info.oo2.Ejercicio4;

public class Temporario extends EmpleadoPermanente{
	
	private double horas;

	public Temporario(double h, boolean casado, int hijos) {
		super(casado,hijos);
		this.horas=h;
	}
	
	public double getSueldoBasico() {
		return 20000 + this.horas*300;
	}

	
}
