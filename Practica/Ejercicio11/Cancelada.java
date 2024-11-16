package ar.edu.unlp.info.oo2.Ejercicio11;

public class Cancelada extends ProyectoState{
	
	public Cancelada(ProyectoContext proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa() {
		
	}
	
	public double valorMargenMinimo() {
		return 1;
	}
	
	public double valorMargenMaximo() {
		return -1;
	}
	
	public boolean cancelarProyecto() {
		return false;
	}



}
