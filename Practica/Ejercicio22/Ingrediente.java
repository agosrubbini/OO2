package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public class Ingrediente {

	private String nombre;
	private double precio;
	
	public Ingrediente(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}
