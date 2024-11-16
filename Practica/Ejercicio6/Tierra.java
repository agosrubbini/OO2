package ar.edu.unlp.info.oo2.Ejercicio6;

public class Tierra extends Topografia{
	
	//private int proporcionAgua;
	
	public Tierra() {
		this.proporcionAgua=0;
	}
	
	public boolean igual(Topografia topo) {
		return topo.soyIgualTierra();
	}
	
	public boolean soyIgualAgua() {
		return false;
	}
	
	public boolean soyIgualTierra() {
		return true;
	}
	
	public boolean soyIgualMixta(Mixta m) {
		return false;
	}
	
}
