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
    
	public int getNivelSigilo() {
        return nivelSigilo;
    }

    public void setNivelSigilo(int nivelSigilo) {
        this.nivelSigilo = nivelSigilo;
    }

    public int getDañoVeneno() {
        return dañoVeneno;
    }

    public void setDañoVeneno(int dañoVeneno) {
        this.dañoVeneno = dañoVeneno;
    }

    
    public String ataqueBásico() {
        return "El ataque básico del asesino " + nombre + " usa sigilo de nivel " + nivelSigilo + " y daño por veneno de " + dañoVeneno;
    }

    
    public String habilidadEspecial() {
        return "La habilidad especial del asesino " + nombre + " es eliminar al enemigo silenciosamente";
    }

    
    public String resumenCombate() {
        return "El asesino " + nombre + " atacó usando sigilo y veneno causando daño mortal";
    }

    
    public String estadoGeneral() {
        return "El asesino " + nombre + " de nivel " + nivel + " tiene una salud de " + salud + ", una resistencia de " + resistencia + " y una velocidad de " + velocidad;
    }
}