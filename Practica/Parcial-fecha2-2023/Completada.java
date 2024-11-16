package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

public class Completada extends EstadoTareaSimple{

	public Completada(Simple tarea) {
		super(tarea);
	}
	
	public void iniciarTarea() {
		
	}
	
	public void finalizarTarea() {
		
	}
	
	public int tiempoUtilizado() {
		return this.tarea.calcularTiempo();
	}
}
