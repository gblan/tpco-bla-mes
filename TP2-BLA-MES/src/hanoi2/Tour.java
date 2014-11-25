package hanoi2;

import hanoi1.ErreurPile;
import hanoi1.ErreurTour;

public class Tour extends Pile {
    
    public Tour(int capa) {
    	super(capa);
    }

    public void empiler(Object v) throws ErreurPile {
    	try {
    		Empilable emp = (Empilable) v;
    		if (((Empilable) sommet()).compareTo(emp)<0) {
    			throw new ErreurTour("Disque non empilable");
    		} else {
    			super.empiler(v);
    		}
		} catch (Exception e) {
			throw new ErreurPile("objet non empilable");
		}
    }
}
