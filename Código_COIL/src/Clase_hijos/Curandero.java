package Clase_hijos;

import Clase_padres.Heroe;

public class Curandero extends Heroe{
	int pociones, mana;

	public Curandero(String nombre, int nivel, int salud, int resistencia, int velocidad, int honor,
			int energiaLuminosa, int pociones, int mana) {
		super(nombre, nivel, salud, resistencia, velocidad, honor, energiaLuminosa);
		this.pociones = pociones;
		this.mana = mana;
	}
	

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
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
	
	public String purificar() {
		return null;
	}
	
	public String revivir() {
		return null;
	}
	
	public String curarHeridas() {
		return null;
	}
	
}
