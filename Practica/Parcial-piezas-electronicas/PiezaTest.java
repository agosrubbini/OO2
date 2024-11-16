package ar.edu.unlp.info.oo2.PiezasElectronicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiezaTest {

		private Simple core;
		private Simple tarj;
		private Compuesta cpu;
			

			@BeforeEach
			public void setUp() {
				core= new Simple("Core i7", 90, 105);
				tarj= new Simple("Tarjeta gradica nVIDIA", 50, 30);
				ArrayList<Pieza> list= new ArrayList<Pieza>();
				list.add(core);
				list.add(tarj);
				cpu = new Compuesta("CPU notebook", list);
				}

			@Test
			public void testInscribir() {
				assertEquals("CPU notebook - Ahorro de energia :\nCore i7, bateria al 90.0%, potencia de 105.0w\nTarjeta gradica nVIDIA, bateria al 50.0%, potencia de 30.0w\nbateria al 56.0%, potencia de 47.25w",this.cpu.imprimir());
			}

}

