package ar.edu.unlp.info.oo2.Ejercicio9;


public abstract class ExcursionState {
	
	protected Excursion excursion;
	
	public ExcursionState(Excursion excursion) {
		this.excursion = excursion;
	}
	//cuando tengo una jerarquia es preferible declarar el metodo abstracto o implementarlo y q una de las subclases lo redefina?
	public void inscribir (Usuario usuario) {
		this.excursion.agregarInscripto(usuario);
		if (this.excursion.alcanzoCupoMinimo())//hago el metodo o lo mando como parametro??
			this.excursion.setEstado(new DefinitivaIncompleta(excursion));
		else {
			if (this.excursion.alcanzoCupoMaximo())
				this.excursion.setEstado(new DefinitivaCompleta(excursion));
		}
	}
	
	public void inscribir (Usuario usuario, int cupoMinimo, int cupoMaximo, int cantInscriptos) {
		this.excursion.agregarInscripto(usuario);
		if (cantInscriptos == cupoMinimo)//hago el metodo o lo mando como parametro??
			this.excursion.setEstado(new DefinitivaIncompleta(excursion));
		else {
			if (cantInscriptos == cupoMaximo)
				this.excursion.setEstado(new DefinitivaCompleta(excursion));
		}
	}
	// nombre, costo, fechas, punto de encuentro, cantidad de usuarios faltantes para alcanzar el cupo mínimo.

	public abstract String obtenerInformacion();

}
