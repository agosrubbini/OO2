package ar.edu.unlp.info.oo2.PiezasElectronicas;

public class Ahorro extends Configuracion{

	public double calcularIncrementoBateria(double bateria) {
		return bateria * 0.8;
	}
	
	public double calcularIncrementoPotencia(double potencia) {
		return potencia*0.7;
	}
	
	public String info() {
		return "Ahorro de energia";
	}

}
