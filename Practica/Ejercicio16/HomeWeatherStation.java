package ar.edu.unlp.info.oo2.Ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{

	protected double temperatura;
	protected double presion;
	protected double radiacionSolar;
	protected List<Double> temperaturas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacion) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacion;
		this.temperaturas = new ArrayList<Double>();
	}
	
	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return this.temperatura;
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.presion;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas(){
		return this.temperaturas;
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
	return "Temperatura F: " + this.getTemperatura() +
	   	  "Presión atmosf: " + this.getPresion() +
	   	  "Radiación solar: " + this.getRadiacionSolar();
	}

}
