package ar.edu.unlp.info.oo2.Ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class ArqueroFactory {

	public Personaje crearPersonaje() {
		List<String> habilidades = new ArrayList<String>();
		habilidades.add("tiros de flechas");
		return new Personaje("Arquero", habilidades, new ArmaArco(), new ArmaduraCuero());
	}
}
