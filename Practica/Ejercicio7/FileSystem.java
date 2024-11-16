package ar.edu.unlp.info.oo2.Ejercicio7B;

import java.time.LocalDate;
import java.util.*;

public class FileSystem {
	
	private Elemento raiz;
	
	
	public FileSystem() {
		this.raiz = new Directorio("Raiz",LocalDate.now());
	}
	
	
	public int tamanoTotalOcupado() 
	{
		return this.raiz.espacioTotal();
	}

	public Archivo archivoMasGrande() 
	{
		return raiz.buscarArchivoMasGrande();
	}

	public Archivo archivoMasNuevo() 
	{
		return raiz.buscarArchivoMasNuevo();
	}

	
	public Elemento buscar(String nombre)
	{
		return this.raiz.buscarNombre(nombre);
	}

	/**
	* Retorna la lista con los elementos que coinciden con el nombre solicitado 
    * contenido en cualquier nivel del filesystem
    */
	 public List<Elemento> buscarTodos(String nombre)
	 {
		 List<Elemento> listaNombres = new ArrayList<Elemento>();
		 return raiz.buscarTodosLosNombres(nombre, listaNombres);
	 }

	 /**
	 * Retorna un String con los nombres de los elementos contenidos en todos los 
	 * niveles del filesystem. De cada elemento debe retornar el path completo
	 * (similar al comando pwd de linux) siguiendo el modelo presentado a
	 * continuación
	 /Directorio A
	 /Directorio A/Directorio A.1
     /Directorio A/Directorio A.1/Directorio A.1.1
     /Directorio A/Directorio A.1/Directorio A.1.2 	
     /Directorio A/Directorio A.2
     /Directorio B
     */
	 public String listadoDeContenido() {}

}
