package ar.edu.unlp.info.oo2.PiezasElectronicas;

public class Simple extends Pieza{
	
	private int capacidadBateria;
	private int potencia;
	
	public Simple(String nombre, int capacidadBateria, int potencia) {
		super(nombre);
		this.capacidadBateria = capacidadBateria;
		this.potencia = potencia;
	}
	
	public double calcularBateria() {
		return this.capacidadBateria;
	}
	
	public double calcularPotencia() {
		return this.potencia;
	}
	

	public String info() {
		return ", ";
	}

	
}
