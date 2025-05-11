package Clase_padres;

import Clase_abuelo.Personaje_Base;

public abstract class Villano extends Personaje_Base{
private int malicia,energiaOscura;

public Villano(String nombre, int nivel, int salud, int resistencia, int velocidad, int malicia, int energiaOscura) {
	super(nombre, nivel, salud, resistencia, velocidad);
	this.malicia = malicia;
	this.energiaOscura = energiaOscura;
}

public int getMalicia() {
	return malicia;
}

public void setMalicia(int malicia) {
	this.malicia = malicia;
}

public int getEnergiaOscura() {
	return energiaOscura;
}

public void setEnergiaOscura(int energiaOscura) {
	this.energiaOscura = energiaOscura;
}

}
