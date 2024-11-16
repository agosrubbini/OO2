package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

public class Pendiente extends EstadoTareaSimple{

	public Pendiente(Simple tarea) {
		super(tarea);
	}
	
	public void iniciarTarea() {
		//this.tarea.setInicio();
		this.tarea.setEstado(new Iniciada(this.tarea));
	}
	
	public void finalizarTarea() {
		
	}
	
	public int tiempoUtilizado() {
		return 0;
	}
}
