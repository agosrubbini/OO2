package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.Duration;
import java.time.LocalDate;
import java.util.*;

public class ToDoItem {//CLASE CONTEXT clase Tarea, es la clase u objeto q cambia de comportamiento

	private String nombre;
	private State estado;
	private LocalDate inicioTarea;
	private LocalDate finTarea;
	private List<String> comentarios;

	        public ToDoItem(String name) {
	        	this.nombre = name;
	        	this.estado = new Pending(this);
	        	this.comentarios= new ArrayList<String>();
	        }
	        
	        public void setEstado(State estado) {
	        	this.estado=estado;
	        }
	        
	        public void setInicio(LocalDate inicio) {
	        	this.inicioTarea = inicio;
	        }
	        
	        public void setFin(LocalDate fin) {
	        	this.finTarea = fin;
	        }

	        public void start() {
	        	this.estado.start();//ES LO MISMO MANDAR LA TAREA POR PARAMETRO EN TODOS LOS METODOS PARA DESPUES HACERLE EL SET O ES MEJOR TENERLO COMO V.I EN LA CLASE STATE?
	        }

	        public void togglePause() {
	        	this.estado.togglePause();
	        }
	        
	        public void finish() {
	        	this.estado.finish();
	        	//this.finTarea=LocalDate.now(); no irira aca porq si se llama con un estado invalido igual me la finaliza
	        }

	        public Duration workedTime() {
	        	return this.estado.workedTime(this.inicioTarea,this.finTarea);
	        }

	        public void addComment(String comment) {
	        	this.estado.addComment(comment);
	        }
	        
	        public void setComment(String comment) {
	        	this.comentarios.add(comment);
	        }
	       
	        
	        //public Duration calculo() {
	        //	return Duration.between(inicioTarea, finTarea);
	        //}

}
