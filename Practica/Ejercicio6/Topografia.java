package ar.edu.unlp.info.oo2.Ejercicio6;

public abstract class Topografia {

	protected double proporcionAgua;
	
	
	
	public double getProporcionAgua() {
		return this.proporcionAgua;
	}
	
	public boolean equals(Object o) {
		return this.igual((Topografia)o);
	}
	
	public abstract boolean igual(Topografia topo);
	public abstract boolean soyIgualAgua();
	public abstract boolean soyIgualTierra();
	public abstract boolean soyIgualMixta(Mixta m);
	
	public double getPropocionTierra() {
		return 1 - this.getProporcionAgua();
	}
}

