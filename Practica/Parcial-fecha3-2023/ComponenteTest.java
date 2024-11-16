package ar.edu.unlp.info.oo2.Parcial3raFecha2023;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComponenteTest {

		private Boton boton;
		private Etiqueta etiqueta;
		private Contenedor contenedor;
		

		@BeforeEach
		public void setUp() {
			boton= new Boton("Aceptar", "accept()","color:red; text-size:10px;" );
			this.etiqueta = new Etiqueta("Parcial de objetos", "color:blue; text-size:12px");
			ArrayList<Componente> list = new ArrayList<>();
			list.add(boton);
			list.add(etiqueta);
			contenedor= new Contenedor(list);
			}

		@Test
		public void testInscribir() {
			assertEquals("<contenedor><boton estilo=\"color:red; text-size:10px;\"texto= \"Aceptar\" accion=\"accept()\"/><etiqueta estilo=\"color:blue; text-size:12px\"/> Parcial de objetos</etiqueta></contenedor>",this.contenedor.imprimir());
		}
}


