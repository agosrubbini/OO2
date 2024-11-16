package ar.edu.unlp.info.oo2.Parcial3raFecha2023;

public class Boton extends Componente{

	private String texto;
	private String accion;
	private String estilo;
	
	public Boton(String texto, String accion, String estilo) {
		this.texto = texto;
		this.accion = accion;
		this.estilo = estilo;
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estilo = estilo.getEstiloBoton();
	}
	
	public String imprimir() {
		return "<boton estilo=\""+this.estilo+ "\""+"texto= "+"\"" +this.texto + "\"" +" accion="+"\""+this.accion+"\""+"/>";
	}
	
}
