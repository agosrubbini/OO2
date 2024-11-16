package ar.edu.unlp.info.oo2.Ejercicio11;

public class Confirmada extends ProyectoState{
	
	public Confirmada(ProyectoContext proyecto) {
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


}
