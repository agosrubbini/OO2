package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

	private List<Ingrediente> ingredientes;
	

	public Sandwich() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}
	
	public List<Ingrediente> getPartes() {
		return ingredientes;
	}

	public double getPrecio() {
		return this.getPartes().stream()
				.mapToDouble(parte -> parte.getPrecio())
				.sum();
	}
	
	public void addParte(Ingrediente parte) {
		this.ingredientes.add(parte);
	}
}
