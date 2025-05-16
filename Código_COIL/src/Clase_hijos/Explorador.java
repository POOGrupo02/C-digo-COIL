package Clase_hijos;

import Clase_padres.Heroe;

public class Explorador extends Heroe {
	
	private String flechaEspecial;
	public Explorador(String nombre, int nivel, int salud, int resistencia, int velocidad, int honor,
			int energiaLuminosa, String flechaEspecial) {
		super(nombre, nivel, salud, resistencia, velocidad, honor, energiaLuminosa);
		this.flechaEspecial = flechaEspecial;
	}

	public String getFlechaEspecial() {
		return flechaEspecial;
	}

	public void setFlechaEspecial(String flechaEspecial) {
		this.flechaEspecial = flechaEspecial;
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
	

}
