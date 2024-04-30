/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgam;

/**
 *
 * @author FER
 */
public class EndGam {

    public static void main(String[] args) {
        Heroe blackpanter=new Heroe("Black Panter grrr","Ser el rey de wakanda","Garras de Vibranium");
        Villano galactus=new Villano("galactus el devorador del mundo","Devorar mundos","usa de chalan a silver surfer");
        Avenger ironMan =new Avenger("Tony Start","Genio, Fliantropo, multimillonario,playboy","Mark 42","");
        Thanos thanos=new Thanos("Thanos","El titan loco","Ejercito Chitaury","Guantelete del infinito");
        
        //aplicando polimorfismo
        
        Personaje[] personajes= {blackpanter,galactus,ironMan,thanos};
        for(personaje:personajes){
         personaje.atacar();
        }
        
        //metodo especifico de Avenger
        ((Avenger)ironMan).reunirse();
        
        //ejemplo metodo espefico de Thanos
        thanos.chasquearDedos();
    }
    
                
   }

