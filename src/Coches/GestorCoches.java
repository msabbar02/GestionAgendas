package Coches;

import java.util.*;

public class GestorCoches {
    ArrayList<Coche> coches;
    HashSet<Coche> cocheHashSet;

    public GestorCoches(){
        this.coches = new ArrayList<>();
        this.cocheHashSet = new HashSet<>();
    }

    public void add(){
        coches.add(new Coche("ABC-123"));
        coches.add(new Coche("XYZ-789"));
        coches.add(new Coche("LMN-456"));
        coches.add(new Coche("ABC-123"));
        coches.add(new Coche("JKL-987"));
        coches.add(new Coche("XYZ-789"));
        coches.add(new Coche("PQR-654"));
        coches.add(new Coche("LMN-456"));
    }
    public void mostrar2(){
        for (Coche coche: coches){
            System.out.println(coche);
        }
    }

    public void recorrer(){
        Random random = new Random();
        Iterator<Coche> cocheIterator = coches.iterator();
        while (cocheIterator.hasNext()){
            Coche coche = cocheIterator.next();
            if (random.nextBoolean()){ /* 50%*/
                cocheHashSet.add(coche);
                System.out.println("el coche con "+ coche +" ha pasdo");
            }else {
                System.out.println("el coche con "+ coche +" no ha pasado.");
            }
        }
    }

    public void mostrar(){
        for (Coche coche: cocheHashSet){
            System.out.println(coche);
        }
    }

}
