/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author Diego Carcamo
 */
public class Terrestre extends Planeta{

    public Terrestre(String nombre, double size, double peso, double x, double y) {
        super(nombre,size,peso,x,y);
    }

    @Override
    public boolean getProbabilidad() {
        
        Random r= new Random();
        int num= r.nextInt(100)+1;
        System.out.println("num la probabilidad fue de "+num);
        
        return num<=25;
        
        
        
        
    }
    
    
    
    
    
}
