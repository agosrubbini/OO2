package ar.edu.unlp.info.oo2.Ejercicio4;

public class Planta extends EmpleadoPermanente{
	
	private int antiguedad;
	
	
	public Planta (int antiguedad, boolean casado, int hijos) {
		super(casado,hijos);
		this.antiguedad=antiguedad;
	}
	
	public double getSueldoBasico() {
		return 50000;
	}
	
	public double getSueldoAdicional() {
		return super.getSueldoAdicional() + this.antiguedad*2000;
	}

	

}
