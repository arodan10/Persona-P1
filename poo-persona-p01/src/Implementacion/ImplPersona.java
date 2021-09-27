package Implementacion;

import Entidad.Persona;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ImplPersona {
    
    List<Persona> lis = new CopyOnWriteArrayList<>();
    int id = 0;
    
    public void create(Persona p){
        id = id +1;
        p.setId(id);
        lis.add(p);
    }
            
    public List<Persona> list(){
        return lis;
    }
    
    public void delete(int id){
        for(Persona ps: lis){
            if (id == ps.getId()) {
                System.out.println("Eliminando a: "+ps.getNombres());
                lis.remove(ps);
            }
        }
    }
}
