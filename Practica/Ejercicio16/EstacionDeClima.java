package ar.edu.unlp.info.oo2.Ejercicio16;

public class EstacionDeClima extends HomeWeatherStation{
	
	public EstacionDeClima(double temperatura, double presion, double radiacion) {
		super(temperatura, presion, radiacion);
	}
	
	@Override
	public String displayData(){
		return "Temperatura C: " + this.getTemperatura() +
		   	  "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
		}
	
	public double promedioTemperaturas() {
		return this.getTemperaturas().stream()
				.mapToDouble(temperatura -> temperatura.doubleValue())
				.average().orElse(0);
	}
}
