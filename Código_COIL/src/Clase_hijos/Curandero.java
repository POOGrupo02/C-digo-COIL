package Clase_hijos;

import Clase_padres.Heroe;

public class Curandero extends Heroe{
	int cantPociones, mana;
    
	public Curandero(String nombre, int nivel, int salud, int resistencia, int velocidad, int honor,
			int energiaLuminosa, int cantPociones, int mana) {
		super(nombre, nivel, salud, resistencia, velocidad, honor, energiaLuminosa);
		this.cantPociones = cantPociones;
		this.mana = mana;
	}

	public int getCantPociones() {
		return cantPociones;
	}

	public void setCantPociones(int cantPociones) {
		this.cantPociones = cantPociones;
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
	
}
