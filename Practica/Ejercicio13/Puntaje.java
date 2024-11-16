package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends SugerirPeliculaStrategy{

	public List<Pelicula> filtrarPorStrategy(Decodificador decodificador){
		return decodificador.getGrilla().stream()
				.sorted((peli1, peli2) -> Double.compare(peli1.getPuntaje(),peli2.getPuntaje()))
				.collect(Collectors.toList());
	}

}
