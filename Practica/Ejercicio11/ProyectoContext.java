package ar.edu.unlp.info.oo2.Ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProyectoContext {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int catidadIntegrantes;
	private double montoPorIntegrante;
	private double margenDeGanancia;
	private ProyectoState estadoProyecto;
	
	public ProyectoContext(LocalDate fi, LocalDate ff, String obj, int catnI, double monto) {
		this.fechaInicio = fi;
		this.fechaFin = ff;
		this.objetivo = obj;
		this.catidadIntegrantes = catnI;
		this.montoPorIntegrante = monto;
		this.margenDeGanancia = 0.07;
		this.estadoProyecto = new EnConstruccion(this);
	}
	
	public void setEstadoProyecto(ProyectoState estado) {
		this.estadoProyecto = estado;
	}
	
	public void aprobarEtapa() {
		this.estadoProyecto.aprobarEtapa();
	}
	
	public int duracionDelProyecto() {
		return (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	public double costoDelProyecto() {
		return this.catidadIntegrantes * this.montoPorIntegrante * this.duracionDelProyecto();
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto() * this.margenDeGanancia + this.costoDelProyecto();
	}
	
	public void modificarMargenDeGanancia(double valor) {
		this.estadoProyecto.modificarMargenDeGanancia(valor);
	}
	
	public void cancelarProyecto() {
		if (this.estadoProyecto.cancelarProyecto())
			this.objetivo = this.objetivo + "cancelado";	
	}
	
	public void modificarMargen(double valor) {
		this.margenDeGanancia = valor;
	}

}
