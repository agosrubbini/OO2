package ar.edu.unlp.info.oo2.Ejercicio7B;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Elemento {

	private int tamaño;
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamaño) {
		super(nombre,fechaCreacion);
		this.tamaño= tamaño;
	}
	
	public int espacioTotal() {
		return this.tamaño;
	}
	
	public Archivo buscarArchivoMasGrande() {
		return this;
	}
	
	public Archivo buscarArchivoMasNuevo() 
	{
		return this;
	}
	
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public boolean esMasNuevoQue(Archivo otroArchivo) {
        return this.fechaCreacion.isAfter(otroArchivo.getFechaCreacion());
    }
	



	
	
}
