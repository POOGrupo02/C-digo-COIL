package Clase_padres;

import Clase_abuelo.Personaje_Base;

public abstract class Heroe extends Personaje_Base{
protected int honor,energiaLuminosa;

public Heroe(String nombre, int nivel, int salud, int resistencia, int velocidad, int honor, int energiaLuminosa) {
	super(nombre, nivel, salud, resistencia, velocidad);
	this.honor = honor;
	this.energiaLuminosa = energiaLuminosa;
}

public int getHonor() {
	return honor;
}

public void setHonor(int honor) {
	this.honor = honor;
}

public int getEnergiaLuminosa() {
	return energiaLuminosa;
}

public void setEnergiaLuminosa(int energiaLuminosa) {
	this.energiaLuminosa = energiaLuminosa;
}

}
