package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

public abstract class EstadoTareaSimple {
	
	protected Simple tarea;
	
	public EstadoTareaSimple(Simple tarea) {
		this.tarea = tarea;
	}

	public abstract void iniciarTarea();

	public abstract void finalizarTarea();

	public abstract int tiempoUtilizado();
}
