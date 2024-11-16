package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private SugerirPeliculaStrategy sugerirStrategy;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		this.sugerirStrategy = new Novedad();
	}
	
	public Decodificador(SugerirPeliculaStrategy strategy) {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.sugerirStrategy = strategy;
	}
	
	public void setSugerirStrategy(SugerirPeliculaStrategy strategy) {
		this.sugerirStrategy = strategy;
	}
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void registrarPeliculaReproducida(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.sugerirStrategy.sugerirPeliculas(this);
	}
}
