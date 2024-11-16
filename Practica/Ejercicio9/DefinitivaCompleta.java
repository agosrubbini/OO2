package ar.edu.unlp.info.oo2.Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class DefinitivaCompleta extends ExcursionState {
	
	private List<Usuario> usuariosEnEspera;
	
	public DefinitivaCompleta(Excursion excursion) {
		super(excursion);
		this.usuariosEnEspera = new ArrayList<Usuario>();
	}
	
	public void inscribir (Usuario usuario, int cupoMinimo, int cupoMaximo) {
		this.usuariosEnEspera.add(usuario);
	}
	public String obtenerInformacion() {
		 return "";
		 
	}
}
