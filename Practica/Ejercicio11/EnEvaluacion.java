package ar.edu.unlp.info.oo2.Ejercicio11;

public class EnEvaluacion extends ProyectoState{
	
	public EnEvaluacion(ProyectoContext proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa() {
		this.proyecto.setEstadoProyecto(new Confirmada(proyecto));
	}
	
	public double valorMargenMinimo() {
		return 0.11;
	}
	
	public double valorMargenMaximo() {
		return 0.15;
	}
	


}
