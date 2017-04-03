/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventura;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Personaje {
    int defensa;
    int vitalidad;
    int fuerza;
    public Personaje(int def, int vir, int fue) {
        this.defensa=def;
        this.vitalidad=vir;
        this.fuerza=fue;
    }

 

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa =getDefensa()+defensa;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad =getVitalidad()+vitalidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza =getFuerza()+fuerza;
    }
    
    void mostrarEstado(){
        System.out.println("tu defensa es "+getDefensa());
        System.out.println("tu vitalidad es "+getVitalidad());
        System.out.println("tu fuerza es de "+getFuerza());
    
}
    void caminar(){//llamar a juego para que este le de uno de los 3 lugares
        Scanner leer = new Scanner(System.in);
       
    }
}
