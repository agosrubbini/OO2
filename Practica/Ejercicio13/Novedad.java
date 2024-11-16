package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends SugerirPeliculaStrategy{
	
	public List<Pelicula> filtrarPorStrategy(Decodificador decodificador){
		return decodificador.getGrilla().stream()
				.sorted((peli1, peli2) -> Integer.compare(peli1.getAñoDeEstreno(),peli2.getAñoDeEstreno()))
				.collect(Collectors.toList());
	}

}
