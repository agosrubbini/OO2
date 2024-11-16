package ar.edu.unlp.info.oo2.Ejercicio9;

public class Usuario {//HAGO Q EL USR CONOZCA LA LISTA DE ESTADOS O LA EXCURSION, COMO HAGO SI FUESE LA LISTA PARA "LLENARLA"
	
	private String nombre;
	private String mail;
	
	public Usuario(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
	}
	
	public String getMail() {//que g¿hago con esta clase vacia? el incribir usr no sale de aca sino de excursion?
		return this.mail;
	}
	
}
