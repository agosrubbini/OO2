package ar.edu.unlp.info.oo2.PiezasElectronicas;

public abstract class Pieza {

	private String nombre;
	
	public Pieza(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double calcularBateria();
	public abstract double calcularPotencia();
	public abstract String info();

	
	public String imprimir() {
		return this.nombre + this.info() + "bateria al "+this.calcularBateria()+"%, potencia de "+this.calcularPotencia()+"w";
	}
}
