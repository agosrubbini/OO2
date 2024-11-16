package ar.edu.unlp.info.oo2.Ejercicio4;

public abstract class Empleado {

	private double sueldo;
	
	
	public Empleado() {
		this.sueldo=this.getSueldo();
	}
	
	
	public double getSueldo() {
		
		this.sueldo= this.getSueldoBasico()+ this.getSueldoAdicional();
		//this.sueldo -= this.getDescuento(); si despues cambia el descuento de una clase queda medio ineficiente
		this.sueldo -= (this.getSueldoBasico()*13/100)- (this.getSueldoAdicional()*5/100); //hace el sueldo menos el tot de la resta?
		return this.sueldo;
	}
	
	public abstract double getSueldoBasico();
	public abstract double getSueldoAdicional();	
	
	
	
}
