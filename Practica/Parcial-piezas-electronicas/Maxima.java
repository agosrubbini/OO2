package ar.edu.unlp.info.oo2.PiezasElectronicas;

public class Maxima extends Configuracion{


	public double calcularIncrementoBateria(double bateria) {
		return bateria * 1.5;
	}
	
	public double calcularIncrementoPotencia(double potencia) {
		return potencia*1.2;
	}
	
	public String info() {
		return "Potencia maxima";
	}
	
}
