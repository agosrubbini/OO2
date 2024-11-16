package ar.edu.unlp.info.oo2.Ejercicio15;

public class FechaDeCreacionConcreteDecorator extends Decorator{

	public FechaDeCreacionConcreteDecorator(FileOO2 componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaCreacion();
	}
}
