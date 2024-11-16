package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.Duration;
import java.time.LocalDate;

public class Pending extends State{
	
	public Pending (ToDoItem tarea) {
		super(tarea);
	}
	
	public void start() {
		this.tarea.setEstado(new InProgress(tarea));
		this.tarea.setInicio(LocalDate.now());
	}

	public Duration workedTime(LocalDate inicio, LocalDate fin) {
		throw new RuntimeException("La tarea no ha sido iniciada"); 
	}

}
