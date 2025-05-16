package Clase_hijos;

import Clase_padres.Villano;

public class Asesino extends Villano {
	private int nivelSigilo, dañoVeneno;
	public Asesino(String nombre, int nivel, int salud, int resistencia, int velocidad, int malicia, int energiaOscura,
			int nivelSigilo, int dañoVeneno) {
		super(nombre, nivel, salud, resistencia, velocidad, malicia, energiaOscura);
		this.nivelSigilo = nivelSigilo;
		this.dañoVeneno = dañoVeneno;
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
