package Clase_hijos;

import Clase_padres.Villano;

public class Asesino extends Villano {
	private int sigilo, veneno;

	public Asesino(String nombre, int nivel, int salud, int resistencia, int velocidad, int malicia, int energiaOscura,
			int sigilo, int veneno) {
		super(nombre, nivel, salud, resistencia, velocidad, malicia, energiaOscura);
		this.sigilo = sigilo;
		this.veneno = veneno;
	}

	public int getSigilo() {
		return sigilo;
	}

	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}

	public int getVeneno() {
		return veneno;
	}

	public void setVeneno(int veneno) {
		this.veneno = veneno;
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
	
	public String ataqueFurtivo() {
		return null;
	}
	
	public String desorientar() {
		return null;
	}
}
