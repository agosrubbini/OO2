package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.Duration;
import java.time.LocalDate;

public class Finished extends State{
	
	public Finished (ToDoItem tarea) {
		super(tarea);
	}
	
	public Duration workedTime(LocalDate inicio, LocalDate fin) {
    	return Duration.between(inicio, fin);
	}
	
	public void addComment(String comment) {
		throw new RuntimeException("La tarea ya ha sido finalizada");
	}
}
