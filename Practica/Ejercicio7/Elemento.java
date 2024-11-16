package ar.edu.unlp.info.oo2.Ejercicio7B;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
	
	protected String nombre;
	protected LocalDate fechaCreacion;
	
	public Elemento(String nombre, LocalDate fechaCreacion) {
		this.nombre= nombre;
		this.fechaCreacion= fechaCreacion;
	}
	
	public abstract int espacioTotal();
	
	public abstract Archivo buscarArchivoMasGrande();
	
	public abstract Archivo buscarArchivoMasNuevo();
	
	public Elemento buscarNombre(String nombre)
	{
		if (this.nombre.equals(nombre))
			return this;
		return null;
	}
	
	public List<Elemento> buscarTodosLosNombres(String nombre, List<Elemento> listaNombres)
	{
		if (this.nombre.equals(nombre))
			listaNombres.add(this);
		return listaNombres;
	}

}
