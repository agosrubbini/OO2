package ar.edu.unlp.info.oo2.Ejercicio15;

public class NombreConcreteDecorator extends Decorator{

	public NombreConcreteDecorator(FileOO2 componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre();
	}
}
