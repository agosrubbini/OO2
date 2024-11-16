package ar.edu.unlp.info.oo2.Ejercicio12;

public class Dispositivo {

	private CRC16_Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data); 
		return this.connection.sendData(data,crc);
	}
	
	public void setConnection(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	//public void setCrcCalculator()
	
}
