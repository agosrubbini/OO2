package ar.edu.unlp.info.oo2.Parcial2daFecha2023;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TareaTest {
	private Compleja prepararAlmuerzo;
	private Compleja realizarCompras;
	private Simple supermercado;
	private Simple verduleria;
	private Simple cocinar;
	private Simple prepararMesa;
	

	@BeforeEach
	public void setUp() throws Exception {
		this.supermercado = new Simple("descripcion", "super", 3);
		this.verduleria = new Simple("descripcion", "verdur", 1);
		this.cocinar = new Simple("descripcion", "coc", 2);
		this.prepararMesa = new Simple("descripcion", "mesar", 1);	
		ArrayList<Tarea> lista = new ArrayList<Tarea>();
		lista.add(supermercado);
		lista.add(verduleria);
		this.realizarCompras = new Compleja("descr", lista);
		ArrayList<Tarea> lista2 = new ArrayList<Tarea>();
		lista2.add(realizarCompras);
		lista2.add(cocinar);
		lista2.add(prepararMesa);
		this.prepararAlmuerzo = new Compleja("descripcion", lista2);
		this.supermercado.iniciarTarea();
		this.supermercado.finalizarTarea();
		this.supermercado.setInicioTest(9);
		this.supermercado.setFinTets(11);
		this.verduleria.iniciarTarea();
		this.verduleria.finalizarTarea();
		this.verduleria.setInicioTest(11);
		this.verduleria.setFinTets(12);
		this.cocinar.iniciarTarea();
		this.cocinar.setInicioTest(12);
		
	}

	@Test
	public void testInscribir() {
		assertEquals(0.42857142857142855,this.prepararAlmuerzo.avance());
	}
}
