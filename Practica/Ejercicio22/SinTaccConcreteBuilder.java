package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public class SinTaccConcreteBuilder extends ConstructorSandwichBuilder{

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Ingrediente("Pan de Chipá", 150));
	}

	@Override
	public void construirAderezo() {
		this.getResultado().addParte(new Ingrediente("Salsa Tártara", 18));
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Ingrediente("Carne de Pollo", 250));
	}

	@Override
	public void construirAdicional() {
		this.getResultado().addParte(new Ingrediente("Verduras Grilladas", 200));
	}
}
