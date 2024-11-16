package ar.edu.unlp.info.oo2.Ejercicio19;

import java.util.*;

public class GuerreroFactory implements Factory{

	public Personaje crearPersonaje() {
		List<String> habilidades = new ArrayList<String>();
		habilidades.add("Combate cuerpo a cuerpo");
		return new Personaje("Guerrero", habilidades, new ArmaEspada(), new ArmaduraAcero());
	}
}
