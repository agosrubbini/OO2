package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public class ClasicoConcreteBuilder extends ConstructorSandwichBuilder{

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Ingrediente("Pan Brioche", 100));
	}

	@Override
	public void construirAderezo() {
		this.getResultado().addParte(new Ingrediente("Mayonesa", 20));
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Ingrediente("Carne de Ternera", 300));
	}

	@Override
	public void construirAdicional() {
		this.getResultado().addParte(new Ingrediente("Tomate", 80));
	}
}
