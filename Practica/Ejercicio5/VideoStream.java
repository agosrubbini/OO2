package ar.edu.unlp.info.oo2.Ejercicio5;

public class VideoStream {
	

	public VideoStream() {
		
	}
	
	public void reproduce() {
		
	}

}
/*
topografia
mixta vs simple es distinta
simple vs simple distintas son distintas
dos mixtas intercambiadas
agua/tierra vs tierra/agua porcentaje 
y posicion deben ser iguales

al asunto de la posicion una solucion es 
un for e ir preguntando si 
cada bloque es igual a otro bloque (no es buena)

entonces uso un metodo equals de list que dados dos listas 
compara posicion 1 con pos 1 de otra list pos 2 
con pos 2 y compara por equals todos los elem de la 
lista 1 con los de la lista 2 de los elem en la misma posicion

el metodo equals debe recibir un tipo object entonce 
yo tengo que castear una topografia como obj

debo reimplemetar el equals interior para 
comparar entre psiciones 

topo1.equals(topo2)
topo2.equals(this)
desoues de saber que las dos topo son 
compuestas ahi paso a hacer el equals 

el list de equals compara las pos con el equals de object y 
entonces debo castear 
el equals interno para q compare entre topografias
*/

