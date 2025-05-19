package Clase_hijos;

import Clase_padres.Heroe;

public class Curandero extends Heroe {

    private int cantidadPociones;
    private int mana;

    public Curandero(String nombre, int nivel, int salud, int resistencia, int velocidad, int honor, int energiaLuminosa,
                     int cantidadPociones, int mana) {
        super(nombre, nivel, salud, resistencia, velocidad, honor, energiaLuminosa);
        this.cantidadPociones = cantidadPociones;
        this.mana = mana;
    }

    public int getCantidadPociones() {
        return cantidadPociones;
    }

    public void setCantidadPociones(int cantidadPociones) {
        this.cantidadPociones = cantidadPociones;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    
    public String ataqueBásico() {
        return "El curandero " + nombre + " ataca usando " + mana + " puntos de maná.";
    }

    
    public String habilidadEspecial() {
        return "La habilidad especial del curandero " + nombre + " consiste en usar " + cantidadPociones + " pociones para sanar.";
    }

    
    public String resumenCombate() {
        return "El curandero " + nombre + " utilizó sus pociones y maná para apoyar en la batalla.";
    }

    
    public String estadoGeneral() {
        return "El curandero " + nombre + " de nivel " + nivel + " tiene salud " + salud + ", resistencia " + resistencia +
               ", velocidad " + velocidad + ", honor " + honor + " y energía luminosa " + energiaLuminosa + ".";
    }
}