package ar.edu.unlp.info.oo2.Ejercicio4;

public abstract class EmpleadoPermanente extends Empleado {

	private boolean casado;
	private int cantHijos;
	
	
	public EmpleadoPermanente(boolean casado,int hijos) {
		super();
		this.cantHijos=hijos;
		this.casado=casado;
	}
	
	public abstract double getSueldoBasico();

	public double getSueldoAdicional() {
		double sum=0;
		if (this.casado)
			sum=5000;
		sum += this.cantHijos*2000;
		return sum;
	}
	
}
