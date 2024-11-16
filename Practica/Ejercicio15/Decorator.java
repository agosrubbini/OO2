package ar.edu.unlp.info.oo2.Ejercicio15;

import java.time.LocalDate;

public abstract class Decorator implements FileOO2{

	private FileOO2 componente;
	
	public Decorator(FileOO2 componente) {
		this.componente = componente;
	}
	
	public String prettyPrint() {
		return this.componente.prettyPrint();
	}
	
	public String getNombre() {
		return this.componente.getNombre();
	}
	
	public String getExtension() {
		return this.componente.getExtension();
	}
	
	public double getTamaño() {
		return this.componente.getTamaño();
	}
	
	public LocalDate getFechaCreacion() {
		return this.componente.getFechaCreacion();
	}
	
	public LocalDate getFechaModificacion() {
		return this.componente.getFechaModificacion();
	}
	
	public String getPermisos() {
		return this.componente.getPermisos();
	}

}
