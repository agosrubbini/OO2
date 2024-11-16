package ar.edu.unlp.info.oo2.Ejercicio15;

public class FechaDeModificacionConcreteDecorator extends Decorator{

	public FechaDeModificacionConcreteDecorator(FileOO2 componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaModificacion();
	}
}
