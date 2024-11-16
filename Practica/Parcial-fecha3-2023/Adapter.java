package ar.edu.unlp.info.oo2.Parcial3raFecha2023;

public class Adapter extends Componente{

	private ListaDesplegable adaptee;
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.adaptee.setStyle(estilo.getEstiloEtiqueta());
	}
	
	public String imprimir() {
		return this.adaptee.print();
	}
}
