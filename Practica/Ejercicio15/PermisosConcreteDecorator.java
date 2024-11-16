package ar.edu.unlp.info.oo2.Ejercicio15;

public class PermisosConcreteDecorator extends Decorator{

	public PermisosConcreteDecorator(FileOO2 componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermisos();
	}
}
