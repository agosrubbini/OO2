package ar.edu.unlp.info.oo2.Ejercicio12;

public class WifiConn implements Connection{

	private String pict;
	
	public String sendData(String data, long crc) {
		return data;
	}
	
	public String pict() {
		return this.pict;
	}
}
