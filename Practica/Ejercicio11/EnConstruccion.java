package ar.edu.unlp.info.oo2.Ejercicio11;

public class EnConstruccion extends ProyectoState{
	
	public EnConstruccion(ProyectoContext proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa() {
		if (this.proyecto.precioDelProyecto() != 0)
			this.proyecto.setEstadoProyecto(new EnEvaluacion(proyecto));
		else
			throw new RuntimeException("No se puede aprobar la etapa En Construccion ya que el precio del proyecto es 0");
	}
	
	public double valorMargenMinimo() {
		return 0.08;
	}
	
	public double valorMargenMaximo() {
		return 0.10;
	}

}
