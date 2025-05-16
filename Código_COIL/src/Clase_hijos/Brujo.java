package Clase_hijos;

import Clase_padres.Villano;

public class Brujo extends Villano {

	String hechizo;

	public Brujo(String nombre, int nivel, int salud, int resistencia, int velocidad, int malicia, int energiaOscura,
			String hechizo) {
		super(nombre, nivel, salud, resistencia, velocidad, malicia, energiaOscura);
		this.hechizo = hechizo;
	}
    
	public String getHechizo() {
		return hechizo;
	}

	public void setHechizo(String hechizo) {
		this.hechizo = hechizo;
	}

	@Override
	public String ataqueBásico() {
		return null;
	}

	@Override
	public String habilidadEspecial() {
		return null;
	}

	@Override
	public String resumenCombate() {
		return null;
	}

	@Override
	public String estadoGeneral() {
		return null;
	}
	
	public String malDecir() {
		return null;
	}
	
	public String drenarVida() {
		return null;
	}
	
	public String invocador() {
		return null;
	}
}
