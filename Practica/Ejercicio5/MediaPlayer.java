package ar.edu.unlp.info.oo2.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> medias;
	
	public MediaPlayer() {
		this.medias= new ArrayList<Media>();
	}
	
	public void play() {
		for (Media m:this.medias)
			m.play();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
