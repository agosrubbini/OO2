package ar.edu.unlp.info.oo2.Ejercicio15;

public class TamañoConcreteDecorator extends Decorator{

	public TamañoConcreteDecorator(FileOO2 componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getTamaño();
	}
}
