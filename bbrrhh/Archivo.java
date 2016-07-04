/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbrrhh;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Archivo implements Serializable{

    public Archivo() {
    }
    
    public void guardarArchivoHab(ArrayList<Habitacion> x){
        
        try{
            FileOutputStream s = new FileOutputStream("Habitaciones.txt");
            ObjectOutputStream t = new ObjectOutputStream(s);
            t.writeObject(x);
            t.flush();
            System.out.println("Archivo guardado");
            
        }catch(Exception e){
            System.out.println("error h");
        }
        
    }
    public ArrayList<Habitacion> leerArchivoHab(){
        
        try{
            FileInputStream s = new FileInputStream("Habitaciones.txt");
            ObjectInputStream t = new ObjectInputStream(s);
            return (ArrayList<Habitacion>)(t.readObject());
            
            
        }catch(Exception e){
            System.out.println("error h");
        }
        return new ArrayList();
    } 
    
    public void guardarArchivoClie(ArrayList<Cliente> x){
        
        try{
            FileOutputStream s = new FileOutputStream("Clientes.txt");
            ObjectOutputStream t = new ObjectOutputStream(s);
            t.writeObject(x);
            t.flush();
            System.out.println("Archivo guardado");
            
        }catch(Exception e){
            System.out.println("error c");
        }
    }
    public ArrayList<Cliente> leerArchivoClie(){
        
        try{
            FileInputStream s = new FileInputStream("Clientes.txt");
            ObjectInputStream t = new ObjectInputStream(s);
            return (ArrayList<Cliente>)(t.readObject());
            
            
        }catch(Exception e){
            System.out.println("error c");
        }
        return new ArrayList();
    }
    
        public void guardarArchivoAdmin(Administrador x){
        try{
                FileOutputStream s = new FileOutputStream("Administrador.txt");
                ObjectOutputStream t = new ObjectOutputStream(s);
                t.writeObject(x);
                t.flush();
                System.out.println("Archivo guardado");

            }catch(Exception e){
                System.out.println("error ad");
            }
        }
    public Administrador leerArchivoAdmin(){
        try{
            FileInputStream s = new FileInputStream("Administrador.txt");
            ObjectInputStream t = new ObjectInputStream(s);
        return (Administrador)(t.readObject());
            
            
        }catch(Exception e){
            System.out.println("error ad");
        }
        return new Administrador(null, null, null, null);
    }
    
}
