package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private List<Tweet> tweets;
	private List<Retweet> retweets;
	private String screenName;
	
	
	public Usuario(String name) {
		this.tweets= new ArrayList<Tweet>();
		this.screenName=name;
	}
	
	public boolean mismoNombre(String nom) {
		return this.screenName.equals(nom);
	}
	
	
	public void crearTweet(String texto) {
		if ((texto.length()>0)&&(texto.length()<281)) {
			Tweet tw = new Tweet(texto); 
			this.tweets.add(tw);
		}
	}
	
	public void crearRetweet(Tweet tw) {
		Retweet rt = new Retweet(tw);
		this.retweets.add(rt);
	}
	
	
	public void eliminarTweets() {
		this.retweets.removeAll(retweets);
		this.tweets.removeAll(tweets);
	}
	
	public List<Retweet> getRetweets () {
		return this.retweets;
	}
	
	public void elimarRetweet(Retweet r) {
		if (this.retweets.stream().anyMatch(rt->rt.equals(r))) 
			this.retweets.remove(r);
	}
	
	
}
