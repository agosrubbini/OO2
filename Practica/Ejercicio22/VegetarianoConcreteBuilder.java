package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public class VegetarianoConcreteBuilder extends ConstructorSandwichBuilder{

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Ingrediente("Pan con Semillas", 120));
	}

	@Override
	public void construirAderezo() {
		//Sin aderezo
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Ingrediente("Provoleta Grillada", 200));
	}

	@Override
	public void construirAdicional() {
		this.getResultado().addParte(new Ingrediente("Berenjenas al Escabeche", 100));
	}
}
