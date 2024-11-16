package ar.edu.unlp.info.oo2.Parcial3raFecha2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Contenedor extends Componente{

	private List<Componente> componentes;
	
	public Contenedor(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.componentes.stream().forEach(componente -> componente.aplicarEstilo(estilo));
	}
	
	public String imprimir() {
		String texto = "<contenedor>" ;
		for(Componente c: this.componentes) 
			texto += c.imprimir();
		texto+= "</contenedor>";
		return texto;
	}
}
