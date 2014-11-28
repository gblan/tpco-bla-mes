package hanoi1;

/* definit une pile d'Object de capacité fixee a l'instantiation */
public class Pile {
	private Object[] pile;
	private int capacite;
	private int hauteur;

	/**
	 * @param capacite
	 *            on suppose que la capacite est > 0
	 */
	public Pile(int capacite) {
		this.capacite = capacite;
		this.pile = new Object[capacite];
		this.hauteur = 0;
	}

	public void empiler(Object v) throws ErreurPile {
		if (hauteur == capacite) {
			throw new ErreurPile("Pile pleine");
		}

		this.pile[hauteur] = v;
		hauteur++;
	}

	/* supprime l'element en sommet de pile. Leve ErreurPile si la pile est vide */
	public void depiler() throws ErreurPile {
		if (estVide()) {
			throw new ErreurPile("Depilage impossible, pile vide");
		}
		this.pile[hauteur - 1] = null;
		this.hauteur--;
	}

	/*
	 * sommet : renvoie l'element en sommet de pile * sans * le depiler Leve
	 * ErreurPile si la pile est vide
	 */
	public Object sommet() throws ErreurPile {
		if (estVide()) {
			throw new ErreurPile("Somment inexistant, pile vide");
		}
		return this.pile[hauteur - 1];
	}

    public boolean estVide() {
    	if(hauteur == 0){
    		return true;
    	}else{
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
