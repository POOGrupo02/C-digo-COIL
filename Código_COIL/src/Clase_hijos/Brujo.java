package Clase_hijos;

import Clase_padres.Villano;

public class Brujo extends Villano {

	String hechizo;

	public Brujo(String nombre, int nivel, int salud, int resistencia, int velocidad, int malicia, int energiaOscura,
			String hechizo) {
		super(nombre, nivel, salud, resistencia, velocidad, malicia, energiaOscura);
		this.hechizo = hechizo;
	}
    
	public String getHechizo() {
		return hechizo;
	}

	public void setHechizo(String hechizo) {
		this.hechizo = hechizo;
	}

	
	public String ataqueBásico() {
		return "El ataque básico del brujo "+nombre +" utiliza "+getEnergiaOscura()+" puntos de energía oscura y "+getMalicia()+" de malicia";
	}

	
	public String habilidadEspecial() {
		return "La habilidad especial del brujo "+nombre+" es "+hechizo;
	}

	
	public String resumenCombate() {
		return "El brujo "+nombre+" inflingió daño con el hechizo "+hechizo;
	}

	
	public String estadoGeneral() {
		return "El brujo "+nombre+" de nivel "+nivel+" tiene una salud de "+salud+", una resistencia de "+resistencia+" y ataca con una velocidad de "+
	velocidad;
	}
	
}
