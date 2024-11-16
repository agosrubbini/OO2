package ar.edu.unlp.info.oo2.Ejercicio6;

public class Agua extends Topografia{
	
	//private int proporcionAgua;
	
	public Agua() {
		this.proporcionAgua=1;
	}
	
	public boolean igual(Topografia topo) {
		return topo.soyIgualAgua();
	}
	
	
	public boolean soyIgualAgua() {
		return true;
	}
	
	public boolean soyIgualTierra() {
		return false;
	}
	
	public boolean soyIgualMixta(Mixta m) {
		return false;
	}

}

