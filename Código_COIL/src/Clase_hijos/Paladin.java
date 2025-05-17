package Clase_hijos;

import Clase_padres.Heroe;
public class Paladin extends Heroe {
    private String escudoDivino, espada;

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

    @Override
    public String ataqueBásico() {
        return "El ataque básico del paladín " + nombre + " es usar la espada: " + espada;
    }

    @Override
    public String habilidadEspecial() {
        return "La habilidad especial del paladín " + nombre + " es el escudo divino: " + escudoDivino;
    }

    @Override
    public String resumenCombate() {
        return "El paladín " + nombre + " defendió con el escudo " + escudoDivino + " y atacó con la espada " + espada;
    }

    @Override
    public String estadoGeneral() {
        return "Paladín " + nombre + ", nivel " + nivel + ", salud " + salud + ", resistencia " + resistencia + ", velocidad " + velocidad
                + ", honor " + honor + ", energía luminosa " + energiaLuminosa;
    }


}