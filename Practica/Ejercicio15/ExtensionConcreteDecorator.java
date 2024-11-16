package ar.edu.unlp.info.oo2.Ejercicio15;

public class ExtensionConcreteDecorator extends Decorator{

	public ExtensionConcreteDecorator(FileOO2 componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}
}
