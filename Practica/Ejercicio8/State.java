package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State {
	
	protected ToDoItem tarea;
	
	public State (ToDoItem tarea) {
		this.tarea = tarea;
	}
	
	public void start() {
		
	}
	public void togglePause() {
		throw new RuntimeException("La tarea no se encuentra en estado paused o in-progress");
	}
	public void finish() {
		
	}
	public Duration workedTime(LocalDate inicio, LocalDate fin) {
    	return Duration.between(inicio, LocalDate.now());
	}
	public void addComment(String comment) {
		this.tarea.setComment(comment);
	}
}

