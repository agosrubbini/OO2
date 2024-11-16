package ar.edu.unlp.info.oo2.Parcial2daFecha2023;


public class Simple extends Tarea {
	
	private String nombre;
	private int duracion;
	private EstadoTareaSimple estado;
	private int inicio; //a esto se refiere con registrar momento exacto de comienzo?
	private int fin;//no los inicializo en el constructor?
	
	public Simple(String descripcion, String nombre, int duracion) {
		super(descripcion);
		this.nombre = nombre;
		this.duracion = duracion;
		this.estado = new Pendiente(this);
	}
	
	public void setEstado(EstadoTareaSimple estado) {
		this.estado = estado;
	}
	
	public void iniciarTarea() {
		this.estado.iniciarTarea();
	}

	//public void setInicio() {
		//this.inicio = System.currentTimeMillis();
	//}
	
	public void finalizarTarea() {
		this.estado.finalizarTarea();
	}
	
	//public void setFin() {
		//this.fin = System.currentTimeMillis();
	//}
	
	public int estimacionTotal() {
		return this.duracion;
	}
	
	public int tiempoUtilizado() {
		return this.estado.tiempoUtilizado();
	}
	
	public int calcularTiempo() {
		return this.fin - this.inicio;
	}
	
	public double avance() {
		return this.tiempoUtilizado()/this.estimacionTotal();
	}

	public void setInicioTest(int num) {
		this.inicio = num;
	}

	public void setFinTets(int num) {
		this.fin = num;
	}
}
