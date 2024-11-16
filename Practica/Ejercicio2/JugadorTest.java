package ar.edu.unlp.info.oo2.Ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
	
	private Jugador j1;
	private Jugador j2;
	
	
	
	@BeforeEach
	public void setUp()
	{
		 Objeto t= new Tijera();
		 Objeto pi=new Piedra();
		 Objeto pa= new Papel();
		 j1=new Jugador(t);
		 j2=new Jugador(pi);
	}
	
	@Test
	public void partida() {
		assertEquals(j1.partida(j2),);
	}

}
