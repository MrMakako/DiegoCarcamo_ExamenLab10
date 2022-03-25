/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10examen;

import Objetos.Cientifico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Carcamo
 */
public class Datos {
    
    
    ArrayList<Cientifico>Cientificos;    
    
    
     File Path;

    public Datos() {
        
       Cientificos= new ArrayList<>();
       
       Path= new File("Cientificos.tid");
        
       if(Path.exists()){
           
           Cargar();
       
       
       
       }
        
       
        
        
    }
    
    
    
    public void addCientifico(String nombre){
      if(find(nombre)==null){
          
          Cientificos.add(new Cientifico(nombre));
        
            System.out.println("Se creo un cientifico con el nombre");
            
          try {
              Guardar();
          } catch (IOException ex) {
              Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
          }
            Cargar();
        
        
        }
      
      
    
    
    }

    public ArrayList<Cientifico> getCientificos() {
        return Cientificos;
    }
    
    
    
    
    
    
    public void Cargar(){
        try {
            FileInputStream entry = new FileInputStream(Path);
            
            
            ObjectInputStream dat= new ObjectInputStream(entry);
            
            
             Object s=dat.readObject();
             
             Cientificos=(ArrayList<Cientifico>)s;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    
    
    public void Guardar() throws IOException{
    
        try {
            ObjectOutputStream save= new ObjectOutputStream(new FileOutputStream(new File ("Cientificos.tid")));
            
            
            save.writeObject(Cientificos);
            save.close();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
    
    
    
    }
    
    
    
    public Cientifico find(String nombre){
        
       for(Cientifico c:Cientificos){
       
           if(nombre.equals(c.getName())){
           
               return c;
           
           }
       
       }
       
       return null;
    
    
    
    
    }
    
    
    
    
}
