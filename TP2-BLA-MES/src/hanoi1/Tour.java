package hanoi1;

public class Tour extends Pile {

	public Tour(int capa) {
		super(capa);
	}

	public void remplir(int nb) throws ErreurPile {
		for (; nb > 0; nb--) {
			this.empiler(new Disque(nb));
		}
	}

	public void empiler(Object v) throws ErreurPile {
		Disque disque = (Disque) v;
		if (((Disque) sommet()).compareTo(disque)<0) {
			throw new ErreurTour("Disque non empilable");
		} else {
			super.empiler(v);
		}

	}
}
