/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FER
 */
public class Thanos extends Villano {
    protected String guantelete;
    
    
       public Thanos(String nombre, String poder, String arma, String guantelete){
       super(nombre,poder,arma); 
       this.guantelete=guantelete;
   }
       public void chasquearDedos(){
           System.out.println(nombre+"utiliza el guantelete del infinito"+guantelete);
       }
}
