package hanoi3;

import hanoi1.ErreurPile;
import hanoi1.ErreurTour;

import java.util.ArrayList;

public class HanoiNommee<T extends Empilable<T>> extends Hanoi<T> {

	public HanoiNommee(ArrayList<T> inits) {
		super(inits);
		int nb = inits.size();
		depart = new TourNommee<T>(nb, "Depart");
		milieu = new TourNommee<T>(nb, "Milieu");
		arrivee = new TourNommee<T>(nb, "Arrivee");
		try {
			for (T o : inits)
				depart.empiler(o);
		} catch (ErreurTour e) {
			System.out.println(e.getMessage());
		} catch (ErreurPile e) {
			System.out.println(e.getMessage());
		}
	}

	public void affiche() {
		depart.affiche();
		milieu.affiche();
		arrivee.affiche();
	}

}
