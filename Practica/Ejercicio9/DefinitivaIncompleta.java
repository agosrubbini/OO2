package ar.edu.unlp.info.oo2.Ejercicio9;


public class DefinitivaIncompleta extends ExcursionState {
	
	public DefinitivaIncompleta(Excursion excursion) {
		super(excursion);
	}
	
	public String obtenerInformacion() {
		 return "usarios faltantes para alcanzar el cupo minimo: "
	+this.excursion.cantRestante() + "mails de usuarios inscriptos: "+ this.excursion.usuariosMails().toString();
		 
	}

}
