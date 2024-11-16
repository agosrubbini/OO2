package ar.edu.unlp.info.oo2.Ejercicio9;


public class Provisoria extends ExcursionState{
	
	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	public String obtenerInformacion() {
		 return "usarios faltantes para alcanzar el cupo minimo: "+this.excursion.cantRestante();
		 
	}
	

}
