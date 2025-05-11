package Clase_hijos;

import Clase_padres.Heroe;

public class Paladin extends Heroe{
private String escudoDivino,espada;

public Paladin(String nombre, int nivel, int salud, int resistencia, int velocidad, int honor, int energiaLuminosa,
		String escudoDivino, String espada) {
	super(nombre, nivel, salud, resistencia, velocidad, honor, energiaLuminosa);
	this.escudoDivino = escudoDivino;
	this.espada = espada;
}

public String getEscudoDivino() {
	return escudoDivino;
}

public void setEscudoDivino(String escudoDivino) {
	this.escudoDivino = escudoDivino;
}

public String getEspada() {
	return espada;
}

public void setEspada(String espada) {
	this.espada = espada;
}

public String AtaqueBásico() {
	return null;
}

public String HabilidadEspecial() {
	return null;
}

public String ResumenCombate() {
	return null;
}

public String EstadoGeneral() {
	return null;
}

}
