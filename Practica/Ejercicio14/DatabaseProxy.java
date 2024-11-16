package ar.edu.unlp.info.oo2.Ejercicio14;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{

	private boolean loggeado;
	private DatabaseAccess dataBase;
	private String contraseña;
	
	public DatabaseProxy(DatabaseAccess dataBase, String contra) {
		loggeado = false;
		this.dataBase = dataBase;
		this.contraseña = contra;
	}
	
	public void setLoggeado(boolean loggeado) {
		this.loggeado = loggeado;
		
	}
	
	public int insertNewRow(List<String> rowData) {
		if (this.loggeado)
			return this.dataBase.insertNewRow(rowData);
		else
			throw new RuntimeException("debe loggearse");
	}
	public Collection<String> getSearchResults(String queryString){
		if (this.loggeado)
			return this.dataBase.getSearchResults(queryString);
		else
			throw new RuntimeException("debe loggearse");
	}
	
	public void login(String password) {
		if(!this.loggeado) {
			if(this.contraseña.equals(password)) {
				this.loggeado = true;
			} else {
				throw new RuntimeException("Wrong password. Try again.");
			}
		} else {
			throw new RuntimeException("You're already logged in.");
		}
	}

	public void logOut() {
		if(this.loggeado) {
			this.loggeado = false;
		} else {
			throw new RuntimeException("Not logged in. Please log in first.");
		}
	}
	
}
