package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends SugerirPeliculaStrategy{

	public List<Pelicula> filtrarPorStrategy(Decodificador decodificador){//esta mal hacer el templated method porq me quedo sin decodificador?mando el decodificador como parametro o no hago el template?
		
		return decodificador.getReproducidas().stream()
				.flatMap(peli -> peli.getSimilares().stream())
				.distinct()
				.sorted((peli1, peli2)->Integer.compare(peli1.getAñoDeEstreno(), peli2.getAñoDeEstreno()))
				.collect(Collectors.toList());
	}
}
