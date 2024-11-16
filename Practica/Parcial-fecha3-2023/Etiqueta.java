package ar.edu.unlp.info.oo2.Parcial3raFecha2023;

public class Etiqueta extends Componente{

	private String texto;
	private String estilo;
	
	public Etiqueta(String texto, String estilo) {
		this.texto = texto;
		this.estilo = estilo;
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estilo = estilo.getEstiloEtiqueta();
	}
	
	public String imprimir() {
		return "<etiqueta estilo=\""+this.estilo+ "\""+"/> "+ this.texto +"</etiqueta>";
	}

	
}
