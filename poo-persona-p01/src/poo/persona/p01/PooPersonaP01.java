
package poo.persona.p01;

import Entidad.Persona;
import Implementacion.*;
import java.util.Scanner;

public class PooPersonaP01 {
    ImplePersona ip = new ImplePersona();
    
    public void listar(){
        System.out.println(" ");
        for(Persona p : ip.list()){
            System.out.print(p.getId()+" ");
            System.out.print(p.getNombres()+" ");
            System.out.print(p.getAp_paterno()+" ");
            System.out.print(p.getAp_materno()+" ");
            System.out.println(p.getSexo()); 
        }
    }
    
    public void crear() {
        Persona p1 = new Persona();
        p1.setNombres("DANIEL");
        p1.setAp_paterno("ARO");
        p1.setAp_materno("MAQUERA");
        p1.setSexo("M");
        
        Persona p2 = new Persona();
        p2.setNombres("BRYAN");
        p2.setAp_paterno("MONRROY");
        p2.setAp_materno("TUMPI");
        p2.setSexo("M");      
       
        
        ip.create(p1);
        ip.create(p2);
        
    }
    
    public void eliminar(){
        listar();
        int opt = 0;
        Scanner tc = new Scanner(System.in);
        System.out.print("\nElijA el ID de la persona: ");
        opt = tc.nextInt();
        ip.delete(opt);
        System.out.println("¡ELIMINADO CORRECTAMENTE!");
    }
    
    public static void main(String[] args) {
        PooPersonaP01 po = new PooPersonaP01();
        int opt;
        Scanner tc = new Scanner(System.in);
            String mensaje =("\nElige la opcion que quieres ejecutar:\n"+
            "\t1 = crear\n\t2 = listar\n\t3 = eliminar -------- ");
            System.out.print(mensaje);

        do {
            opt = tc.nextInt();
            switch(opt){
                case 1: po.crear();
                    System.out.println("¡CREADO CORRECTAMENTE!");break;
                case 2: po.listar(); break;
                case 3: po.eliminar(); break;
            }
            if(opt!=0){
            System.out.print(mensaje);}
        } while (opt!=0);
    }  
}
