package ar.edu.unlp.info.oo2.PiezasElectronicas;

import java.util.ArrayList;
import java.util.List;

public class Compuesta extends Pieza{

	private List<Pieza> piezas;
	private Configuracion strategy;
	
	public Compuesta(String nombre, ArrayList<Pieza> piezas) {
		super(nombre);
		this.piezas = piezas;
		this.strategy = new Ahorro();
	}
	
	public double calcularPotencia() {
		return this.strategy.calcularIncrementoPotencia(this.calcularPotenciaPiezas());
	}
	
	public double calcularPotenciaPiezas() {
		return this.piezas.stream()
				.mapToDouble(pieza -> pieza.calcularPotencia())
				.average().orElse(0);
	}
	
	public double calcularBateria() {
		return this.strategy.calcularIncrementoBateria(this.calcularBateriaPiezas());
	}
	
	private double calcularBateriaPiezas() {
		return this.piezas.stream()
				.mapToDouble(pieza -> pieza.calcularBateria())
				.average().orElse(0);
	}
	
	public void setStrategy(Configuracion strategy) {
		this.strategy = strategy;
	}
	
	public String info() {
		String info= " - "+this.strategy.info()+" :";
		for (Pieza p : this.piezas) {
			info+="\n";
			info+= p.imprimir();
		}
		return info+"\n";
	}

	
}
