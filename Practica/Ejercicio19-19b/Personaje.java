package ar.edu.unlp.info.oo2.Ejercicio19;

import java.util.List;

public class Personaje {

	private String nombre;
	private int vida;
	private List<String> habilidades;
	private Arma arma;
	private Armadura armadura;
	
	public Personaje (String nombre, List<String> habilidades, Arma arma, Armadura armadura) {
		this.nombre = nombre;
		this.vida = 100;
		this.habilidades = habilidades;
		this.arma = arma;
		this.armadura = armadura;
	}
	
	public void combate(Personaje contrincante) { //el q llega lo ataco
		if (this.vida > 0)
			contrincante.defenderme(this.arma);
	}
	
	private void defenderme(Arma arma) {
		if (this.vida > 0) //es preferible q el contrincante controle aca su vida y despues tener un getVida para el test o es mejor antes q un getVida hacer un metodo estoyVivo q me devuelva si tengo vida
			//ademas con el metodo me ahorro testear la vida por int sino q la testeo por true o false. Si tuviera q testear por int, cuales serian los valores? 0 y 100 limites y 50 valor dentro? y que pasa se tengo 2 de vida y me restan 8, tengo que testear los negativos o hacer q la vida no vaya a menos de 0?
			this.vida -= this.armadura.defender(arma);
	}
	
	
	
}
