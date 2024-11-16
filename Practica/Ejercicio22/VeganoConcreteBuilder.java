package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public class VeganoConcreteBuilder extends ConstructorSandwichBuilder{


	@Override
	public void construirPan() {
		this.getResultado().addParte(new Ingrediente("Pan Integral", 100));
	}

	@Override
	public void construirAderezo() {
		this.getResultado().addParte(new Ingrediente("Salsa Criolla", 20));
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Ingrediente("Milanesa de Girgolas", 500));
	}

	@Override
	public void construirAdicional() {
		//Sin adicional
	}
}
