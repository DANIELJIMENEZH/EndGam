/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FER
 */
public class Personaje {
     protected String nombre;
    protected String poder;
    
    public Personaje(String nombre, String poder){
        this.nombre=nombre;
        this.poder=poder;
    }
    
    public void atacar(){
        //metodo vacio por que sera sobre escrito 
    }
}


