package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

import java.util.ArrayList;
import java.util.List;

public class Compleja extends Tarea {
	
	private List<Tarea> tareas;
	
	public Compleja(String descripcion, ArrayList<Tarea> tareas) {
		super(descripcion);
		this.tareas = tareas;
	}
	
	public void iniciarTarea() {
		this.tareas.stream().forEach(tarea -> tarea.iniciarTarea());
	}
	
	public void finalizarTarea() {
		this.tareas.stream().forEach(tarea -> tarea.finalizarTarea());
	}
	
	public int estimacionTotal() {
		return this.tareas.stream().mapToInt(tarea -> tarea.estimacionTotal()).sum();
	}
	
	public int tiempoUtilizado() {
		return this.tareas.stream().mapToInt(tarea -> tarea.tiempoUtilizado()).sum();
	}
	
	public double avance() {
		return (double) this.tiempoUtilizado()/this.estimacionTotal();
	}

	

}
