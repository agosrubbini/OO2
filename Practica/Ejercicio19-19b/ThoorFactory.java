package ar.edu.unlp.info.oo2.Ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class ThoorFactory implements Factory{

	public Personaje crearPersonaje() {
		List<String> habilidades = new ArrayList<String>();
		habilidades.add("lanzar rayos");
		habilidades.add("combate a distancia");
		return new Personaje("Thoor", habilidades, new ArmaMartillo(), new ArmaduraHierro());
	}
}
