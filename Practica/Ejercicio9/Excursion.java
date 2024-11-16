package ar.edu.unlp.info.oo2.Ejercicio9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private ExcursionState estadoDeExcursion;
	private List<Usuario> inscriptos;
	
	
	public Excursion(String nombre, LocalDate fi, LocalDate ff, String puntoEncuentro, double costo, int cMin, int cMax ) {
		this.nombre = nombre;
		this.fechaInicio = fi;
		this.fechaFin = ff;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cMin;
		this.cupoMaximo = cMax;
		this.estadoDeExcursion = new Provisoria(this);
		this.inscriptos = new ArrayList<Usuario>();
	}
	
	public void setEstado(ExcursionState estado) {
		this.estadoDeExcursion = estado;
	}
	public boolean alcanzoCupoMinimo(){
		return this.cantidadInscriptos() == this.cupoMinimo;
	}
	
	public boolean alcanzoCupoMaximo(){
		return this.cantidadInscriptos() == this.cupoMaximo;
	}
	
	private int cantidadInscriptos() {
		return this.inscriptos.size();
	}
	public void agregarInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}
	
	public void inscribir (Usuario usuario) {
		this.estadoDeExcursion.inscribir(usuario, this.cupoMinimo, this.cupoMaximo, this.cantidadInscriptos());
	}
	

	public List<String> usuariosMails(){//raro como los obtengo
		return this.inscriptos.stream().map(u -> u.getMail()).collect(Collectors.toList());
	}
	
	public int cantRestante() {
		return this.cupoMinimo- this.cantidadInscriptos();
	}
	
	public String obtenerInformacion() {//esta mal si me paso el parametro de usuarios restantes y no lo uso aca pero lo uso en el metodo q redefine este?
		return "nombre excursion: "+ this.nombre +", costo: "+this.costo+", fecha inicio: "+this.fechaInicio+", fecha fin: "+this.fechaFin+
				", punto de encuentro: "+puntoEncuentro + estadoDeExcursion.obtenerInformacion();
		
	}
}
