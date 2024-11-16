package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public abstract class ConstructorSandwichBuilder {

	
	private Sandwich sanguche;
	
	public abstract void construirPan();
	
	public abstract void construirAderezo();
	
	public abstract void construirPrincipal();
	
	public abstract void construirAdicional();
	
	public void reset() {
		this.sanguche = new Sandwich();
	}
	
	public Sandwich getResultado() {
		return this.sanguche;
	}
}
