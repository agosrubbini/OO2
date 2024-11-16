package ar.edu.unlp.info.oo2.Ejercicio5;

public class VideoStreamAdapter {
	
	private VideoStream vs;
	
	public VideoStreamAdapter(VideoStream vs) {
		this.vs= vs;
	}
	

	public void play() {
		this.vs.reproduce();
	}

}
