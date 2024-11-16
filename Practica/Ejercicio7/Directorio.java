package ar.edu.unlp.info.oo2.Ejercicio7B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Elemento {
	
	private List<Elemento> contenido;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.contenido= new ArrayList<Elemento>();
	}
	
	public int espacioTotal() {
		return 32 + this.contenido.stream().mapToInt(elemento -> elemento.espacioTotal()).sum();
	}
	
	//public int espacioTotal2() {
	//	return 32 + this.contenido.stream().forEach(elemento -> elemento.espacioTotal()).sum();
	//} No puedo utilizar forEach ya que este no devuelve ningun valor, solo aplica una accion a cada elemento del stream
	
	
	public Archivo buscarArchivoMasGrande() {
		return this.contenido.stream()
				.map(a -> a.buscarArchivoMasGrande())
				.filter(archivo -> archivo != null)
				.max((a1, a2) -> Integer.compare(a1.espacioTotal(), a2.espacioTotal()))
				.orElse(null);
	}
	
	
	public Archivo buscarArchivoMasNuevo() 
	{
		return this.contenido.stream()
				.map(a -> a.buscarArchivoMasNuevo())
				.filter(archivo -> archivo != null) 
				.max((a1, a2) -> (a1.esMasNuevoQue(a2)? 1 : -1)) //condicion ? valorSiEsTrue : valorSiEsFalse
				.orElse(null);
	}
	
	public Elemento buscarNombre2(String nombre)
	{
		if (this.nombre.equals(nombre))
			return this;
		else
			return this.contenido.stream()
					.map(elem -> elem.buscarNombre(nombre))
					.filter(archivo -> archivo != null)
					.findFirst().orElse(null);
			
	}
	//QUE pasa con la repeticion de codigo del metodo implementado en elemento
	
	public List<Elemento> buscarTodosLosNombres(String nombre, List<Elemento> listaNombres)
	{
		if (this.nombre.equals(nombre))
			listaNombres.add(this);
		this.contenido.stream()
		.map(elem -> elem.buscarTodosLosNombres(nombre, listaNombres))
		.collect(Collectors.toList()); //me pide importar collectors, esta bien?
		
		return listaNombres;
	}

	

}
