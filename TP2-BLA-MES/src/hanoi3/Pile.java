package hanoi3;

import hanoi1.ErreurPile;

// Pile Homogene de <T>, de capacite fixee a l'instantiation

public class Pile<T> {

	private T[] pile;
	private int capacite;
	private int hauteur;

	// suppose 'capa' strictement positif !

	public Pile(int capa) {
		this.capacite = capa;
		this.pile = new T[capacite];
    	this.hauteur = 0;
	}

	public void empiler(T v) throws ErreurPile {
		if(hauteur == capacite){
    		throw new ErreurPile("Pile pleine");
    	}

    	this.pile[hauteur] = v;
    	hauteur++;
	}

	public void depiler() throws ErreurPile {
		if(estVide()){
    		throw new ErreurPile("Depilage impossible, pile vide");
    	}
    	this.pile[hauteur-1] = null;
    	this.hauteur--;
	}

	public T sommet() throws ErreurPile {
		if (estVide()) {
			throw new ErreurPile("Somment inexistant, pile vide");
		}
		return this.pile[hauteur - 1];
	}

	public boolean estVide() {
		if (hauteur == 0) {
			return true;
		} else {
			return false;
		}
	}

	/* renvoie le nombre actuel d'elements dans la pile */
	public int hauteur() {
		return hauteur;
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
		for (int i = hauteur; i > 0; i--) {
			System.out.println("->" + pile[i - 1]);
		}
	}

}
