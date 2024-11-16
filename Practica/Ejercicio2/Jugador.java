package ar.edu.unlp.info.oo2.Ejercicio2;

public class Jugador {

	
	private Objeto opcion;
	
	
	public Jugador(Objeto o) {
		this.opcion=o;
	}
	
	public void cambiarOpcion(Objeto o) {
		this.opcion=o;
	}
	
	private int empezar(Objeto o) {
		return this.opcion.jugar(o);
	}
	public String partida(Jugador j) {
		
		int res= j.empezar(this.opcion);
		if (res==1)
			return "Perdi";
		else {
			if(res==0)
				return "Empate";
			else return "Gane";
	
		}
	}
}
