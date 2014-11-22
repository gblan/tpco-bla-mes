package hanoi3;

import hanoi1.ErreurPile;
import hanoi1.ErreurTour;
import hanoi3.Empilable;

// La classe Tour est elle-meme generique et sous-classe de Pile 
public class Tour<T extends Empilable<T>> extends Pile<T> {

	public Tour(int capa) {
		super(capa);
	}

	public void empiler(T v) throws ErreurPile {
		try {
			if (estVide()) {
				super.empiler(v);
			} else if (sommet().compareTo(v) < 0) {
				throw new ErreurTour("Disque non empilable");
			} else {
				super.empiler(v);
			}
		} catch (Exception e) {
			throw new ErreurPile("objet non empilable");
		}
	}
}
