package ar.edu.unlp.info.oo2.PatronDecoratorEj15;

public class CadenaDirector {

	private ConstructorSandwichBuilder builder;

	public CadenaDirector() {
		this.builder = new ClasicoConcreteBuilder();
	}

	public ConstructorSandwichBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(ConstructorSandwichBuilder builder) {
		this.builder = builder;
	}
	
	public Sandwich construirSandwich() {
		this.builder.reset();
		this.builder.construirPan();
		this.builder.construirAderezo();
		this.builder.construirPrincipal();
		this.builder.construirAdicional();
		return this.builder.getResultado();
	}
	
	
}
