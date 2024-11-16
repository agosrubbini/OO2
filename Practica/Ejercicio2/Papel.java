package ar.edu.unlp.info.oo2.Ejercicio2;

public class Papel extends Objeto{

	
	
	public int jugarConTijera() {
    	return -1;
    }
	
	public int jugarConPapel() {
		return 0;
	}
	
	public int jugarConPiedra() {
		return 1;
	}
	
	public int jugar(Objeto o) {
		return o.jugarConPapel();
	}
}
