package Clase_abuelo;

public abstract class Personaje_Base {
protected String nombre;
protected int nivel,salud,resistencia,velocidad;
public Personaje_Base(String nombre, int nivel, int salud, int resistencia, int velocidad) {

	this.nombre = nombre;
	this.nivel = nivel;
	this.salud = salud;
	this.resistencia = resistencia;
	this.velocidad = velocidad;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
public int getSalud() {
	return salud;
}
public void setSalud(int salud) {
	this.salud = salud;
}
public int getResistencia() {
	return resistencia;
}
public void setResistencia(int resistencia) {
	this.resistencia = resistencia;
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

public abstract String ataqueBásico();
public abstract String habilidadEspecial();
public abstract String resumenCombate();
public abstract String estadoGeneral();
}
