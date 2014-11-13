package hanoi1;

public class Tour extends Pile {
    
    public Tour(int capa) {
    }

    public void remplir(int nb) throws ErreurPile {
	for(; nb > 0; nb--) 
	    this.empiler(new Disque(nb));
    }

    public void empiler(Object v) throws ErreurPile {
    }
}
