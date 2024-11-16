package ar.edu.unlp.info.oo2.Ejercicio12;

public class Connection4G extends AdapterConnection4G{

	private String symb;
	
	public String transmit (String data, long crc) {
		return data;
	}
	
	public String symb() {
		return this.symb;
	}
	
}
