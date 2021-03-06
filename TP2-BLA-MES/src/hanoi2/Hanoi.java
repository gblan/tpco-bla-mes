package hanoi2;

import hanoi1.ErreurPile;
import hanoi1.ErreurTour;

public class Hanoi {

	protected Tour depart, milieu, arrivee;

	public Hanoi(int nb, Class C) throws InstantiationException, IllegalAccessException, ErreurPile {
		depart = new Tour(nb);
		milieu = new Tour(nb);
		arrivee = new Tour(nb);
		/*
		 * initialiser la tour de depart avec nb instances de la classe
		 * concernee
		 */
		remplir(nb, C);
	}

	private void remplir(int nb, Class C) throws ErreurPile, InstantiationException, IllegalAccessException {

		for (; nb > 0; nb--) {
			Empilable emp = (Empilable) C.newInstance();
			emp.init(nb);
			depart.empiler(emp);
		}
	}

	public void jouer() {
		try {
			oneStep(depart.capacite(), depart, arrivee, milieu);
		} catch (ErreurTour e) {
			System.out.println("Erreur de manipulation des Tours: " + e.getMessage());
		} catch (ErreurPile e) {
			System.out.println("Erreur de manipulation des Piles: " + e.getMessage());
		}
	}

	public void affiche() {
		System.out.println("Depart:");
		depart.affiche();
		System.out.println("Milieu:");
		milieu.affiche();
		System.out.println("Arrivee:");
		arrivee.affiche();
	}

	// Empiler nb Disque de D vers A en se servant de M comme Tour auxiliaire
	protected void oneStep(int nb, Tour D, Tour A, Tour M) throws ErreurPile {
		if (nb > 0) {
		    oneStep(nb-1, D, M, A);
		    /* On ne peut pas etre plus precis que Empilable */
		    Empilable o = (Empilable) D.sommet();
		    D.depiler();
		    A.empiler(o);
		    oneStep(nb-1, M, A, D);
		}
	}
}
