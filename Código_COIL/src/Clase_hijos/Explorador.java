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
		return "El ataque básico del explorador " + nombre + " utiliza su flecha especial: " + flechaEspecial;
	}

	@Override
	public String habilidadEspecial() {
		return "La habilidad especial del explorador " + nombre + " combina honor (" + honor + 
		       ") y energía luminosa (" + energiaLuminosa + ") para potenciar su flecha.";
	}

	@Override
	public String resumenCombate() {
		return "El explorador " + nombre + " infligió daño con la flecha especial: " + flechaEspecial;
	}

	@Override
	public String estadoGeneral() {
		return "El explorador " + nombre + " de nivel " + nivel + " tiene salud " + salud + 
		       ", resistencia " + resistencia + ", y velocidad " + velocidad + ".";
	}
}