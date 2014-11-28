package hanoi3;

import hanoi1.ErreurPile;

import java.util.ArrayList;
import java.util.List;

// Pile Homogene de <T>, de capacite fixee a l'instantiation

public class Pile<T> {

	private List<T> pile;
	private int capacite;

	// suppose 'capa' strictement positif !
	public Pile(int capa) {
		this.capacite = capa;
		this.pile = new ArrayList<T>(capa);
	}

	public void empiler(T v) throws ErreurPile {
		if (hauteur() == capacite) {
			throw new ErreurPile("Pile pleine");
		}

		this.pile.add(v);
	}

	public void depiler() throws ErreurPile {
		if (estVide()) {
			throw new ErreurPile("Depilage impossible, pile vide");
		}
		this.pile.remove(hauteur() - 1);
	}

	public T sommet() throws ErreurPile {
		if (estVide()) {
			throw new ErreurPile("Sommet inexistant, pile vide");
		}
		return this.pile.get(hauteur() - 1);
	}

	public boolean estVide() {
		return (hauteur() == 0);
	}

	/* renvoie le nombre actuel d'elements dans la pile */
	public int hauteur() {
		return pile.size();
	}

	/* renvoie la capacite de la pile */
	public int capacite() {
		return capacite;
	}

	public void affiche() {
		/*
		 * Affiche les elements de la pile (un par ligne) dans l'ordre en
		 * commencant par l'element en sommet de pile.
		 */
		for (int i = hauteur(); i > 0; i--) {
			System.out.println("->" + pile.get(i - 1));
		}
	}

}
