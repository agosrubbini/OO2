package ar.edu.unlp.info.oo2.Ejercicio12;

public abstract class AdapterConnection4G {
	
	private Connection4G adapter;
	
	public AdapterConnection4G() {
		this.adapter = new Connection4G();
	}
	
	public String sendData(String data, long crc) {
		return this.adapter.transmit(data,crc);
	}
	
	public String pict() {
		return this.adapter.symb();
	}
	
	//public abstract String transmit(String data, long crc);
	//public abstract String symb();

}
