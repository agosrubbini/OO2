package ar.edu.unlp.info.oo2.Ejercicio6;

import java.util.*;

public class Mixta extends Topografia{

	
	private List<Topografia> partes;
	
	public Mixta(List<Topografia> topos) {
		//this.partes= new ArrayList<Topografia>();
		this.partes=topos;
		this.setProporcionAgua();
		//this.proporcionAgua = this.partes.stream().mapToDouble(topo -> topo.getProporcionAgua()).sum();
				//for (Topografia t : this.partes)
				//t.getProporcionAgua();
	}
	
	public double getProporcionAgua() {
		return this.proporcionAgua;
	}
	
	private void setProporcionAgua() {
		this.proporcionAgua=this.partes.stream().mapToDouble(topo -> topo.getProporcionAgua()).sum()/this.partes.size();
	}
	
	public void añadirALista(Topografia t) {
		this.partes.add(t);
		this.setProporcionAgua();
	}
	
	public boolean igual(Topografia topo) {
		return topo.soyIgualMixta(this);
	}
	
	public boolean soyIgualAgua() {
		return false;
	}
	
	public boolean soyIgualTierra() {
		return false;
	}
	
	public boolean soyIgualMixta(Mixta m) {
		if (this.proporcionAgua == m.getProporcionAgua())//no comparo proporcion de tierra porq si el agua es igual la tierra va a ser igual{
			return m.comparar(this.partes);
		return false;
	}
	
	public boolean comparar(List<Topografia> t ) {
		return t.equals(this.partes);
	}
	
	
	
}

