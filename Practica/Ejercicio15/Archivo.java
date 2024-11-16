package ar.edu.unlp.info.oo2.Ejercicio15;

import java.time.LocalDate;

public class Archivo implements FileOO2{

	private String nombre;
	private String extension; 
	private double tamaño;
	private LocalDate FechaDeCreación;
	private LocalDate FechaDeModificación;
	private String permisos;
	
	public Archivo(String nombre, String extension, double tam, LocalDate fC, LocalDate fM, String permisos ) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tam;
		this.FechaDeCreación = fC;
		this.FechaDeModificación = fM;
		this.permisos = permisos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getExtension() {
		return this.extension;
	}
	
	public double getTamaño() {
		return this.tamaño;
	}
	
	public LocalDate getFechaCreacion() {
		return this.FechaDeCreación;
	}
	
	public LocalDate getFechaModificacion() {
		return this.FechaDeModificación;
	}
	
	public String getPermisos() {
		return this.permisos;
	}
	
	public String prettyPrint() {
		return "Datos del archivo: ";
	}


}
