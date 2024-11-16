package ar.edu.unlp.info.oo2.Ejercicio15;

import java.time.LocalDate;

public interface FileOO2 {

	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public double getTamaño();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	
}
