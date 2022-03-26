/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diego Carcamo
 */
public class Cientifico implements Serializable {
    
    ArrayList<Planeta> Descubrimientos;
    
    
    
    String name;
    public Cientifico(String name) {
        
        Descubrimientos=new ArrayList<>();
        this.name=name;
    }

    public ArrayList<Planeta> getDescubrimientos() {
        return Descubrimientos;
    }
    
    
    public Planeta Find(String nombre){
    
        for(Planeta p:Descubrimientos){
            if(nombre.equals(p.getNombre())){
            
                return p;
            }
            
        
        }
        return null;
    }
    
    
    public void AddPlaneta(Planeta p){
        //Agregar valdiar que no exista
       Descubrimientos.add(p);
        
    
    
    }
    
    

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
}
