package hanoi1;

public class Pile {

/* definit une pile d'Object de capacité fixee a l'instantiation */

    public Pile(int capacite) {
    }

    public void empiler(Object v) throws ErreurPile {
    }

    /* supprime l'element en sommet de pile. Leve ErreurPile si la pile est vide */
    public void depiler () throws ErreurPile {
    }

   /* sommet : renvoie l'element en sommet de pile * sans * le depiler
    * Leve ErreurPile si la pile est vide
    */
   public Object sommet() throws ErreurPile {
    }

    public boolean estVide() {
    }

    /* renvoie le nombre actuel d'elements dans la pile */
    public int hauteur () {
    }

    /* renvoie la capacite de la pile */
    public int capacite () {
    }

    public void affiche () { 
	/* Affiche les elements de la pile (un par ligne) dans l'ordre en commencant par 
	 * l'element en sommet de pile.
	 */
    }
}
