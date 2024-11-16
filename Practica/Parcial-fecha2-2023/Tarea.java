package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

public abstract class Tarea {

	private String descripcion;
	
	public Tarea(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract void iniciarTarea();
	
	public abstract void finalizarTarea();
	
	public abstract int estimacionTotal();
	
	public abstract int tiempoUtilizado();
	
	public abstract double avance();	
	
}
