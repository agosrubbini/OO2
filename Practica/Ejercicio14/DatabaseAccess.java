package ar.edu.unlp.info.oo2.Ejercicio14;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	
	int insertNewRow(List<String> rowData);
	Collection<String> getSearchResults(String queryString);

}
