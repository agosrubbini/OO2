package ar.edu.unlp.info.oo2.Ejercicio11;

public abstract class ProyectoState {
	
	protected ProyectoContext proyecto;
	
	public ProyectoState(ProyectoContext proyecto) {
		this.proyecto = proyecto;
	}
	
	public abstract void aprobarEtapa();
	
	public void modificarMargenDeGanancia(double valor) {
		if (valor >= this.valorMargenMinimo() && valor <= this.valorMargenMaximo())
			this.proyecto.modificarMargen(valor);
	}
	
	public boolean cancelarProyecto() {
		this.proyecto.setEstadoProyecto(new Cancelada(proyecto));
		return true;
	}
	
	public abstract double valorMargenMinimo();
	
	public abstract double valorMargenMaximo();
	

}
