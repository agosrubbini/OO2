package ar.edu.unlp.info.oo2.Ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class MagoFactory {

	public Personaje crearPersonaje() {
		List<String> habilidades = new ArrayList<String>();
		habilidades.add("magia");
		habilidades.add("combate a distancia");
		return new Personaje("Mago", habilidades, new ArmaBaston(), new ArmaduraCuero());
	}
}
