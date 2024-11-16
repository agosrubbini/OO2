package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

public class Iniciada extends EstadoTareaSimple{
	
	public Iniciada(Simple tarea) {
		super(tarea);
	}
	
	public void iniciarTarea() {
		
	}
	
	public void finalizarTarea() {
		//this.tarea.setFin();
		this.tarea.setEstado(new Completada(this.tarea));
	}
	
	public int tiempoUtilizado() {
		return 0;
	}

}
