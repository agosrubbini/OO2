package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.LocalDate;

public class Paused extends State{

	public Paused (ToDoItem tarea) {
		super(tarea);
	}
	
	public void togglePause() {
		this.tarea.setEstado(new InProgress(tarea));
	}
	public void finish() {
		this.tarea.setEstado(new Finished(tarea));
		this.tarea.setFin(LocalDate.now());
	}


}
