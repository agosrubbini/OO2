package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public abstract class SugerirPeliculaStrategy {

	public abstract List<Pelicula> filtrarPorStrategy(Decodificador decodificador);
	
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador){
		return this.filtrarPorStrategy(decodificador).stream()
				.filter(peli -> !decodificador.getReproducidas()
				.contains(peli))
				.limit(3)
				.collect(Collectors.toList());
	
	}
}
