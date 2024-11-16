package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private int añoDeEstreno;
	private List<Pelicula> similares;
	private double puntaje;
	
	public Pelicula(String titulo, int año, double puntaje) {
		this.titulo = titulo;
		this.añoDeEstreno = año;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public int getAñoDeEstreno() {
		return this.añoDeEstreno;
	}

	public double getPuntaje() {
		return this.puntaje;
	}
	
	public List<Pelicula> getSimilares() {
		return this.similares;
	}
}
