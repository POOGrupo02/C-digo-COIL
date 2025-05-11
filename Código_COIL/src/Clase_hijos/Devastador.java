package Clase_hijos;

import Clase_padres.Villano;

public class Devastador extends Villano {
	
	private int fuerzaBruta, ira;

	public Devastador(String nombre, int nivel, int salud, int resistencia, int velocidad, int malicia,
			int energiaOscura, int fuerzaBruta, int ira) {
		super(nombre, nivel, salud, resistencia, velocidad, malicia, energiaOscura);
		this.fuerzaBruta = fuerzaBruta;
		this.ira = ira;
	}

	public int getFuerzaBruta() {
		return fuerzaBruta;
	}

	public void setFuerzaBruta(int fuerzaBruta) {
		this.fuerzaBruta = fuerzaBruta;
	}

	public int getIra() {
		return ira;
	}

	public void setIra(int ira) {
		this.ira = ira;
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
	
	public String provocar() {
		return null;
	}
	
	public String terremeto() {
		return null;
	}
}
