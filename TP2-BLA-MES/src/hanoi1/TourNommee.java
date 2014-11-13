package hanoi1;

public class TourNommee extends Tour {

    protected String nom;

    public TourNommee(int nb, String n) {
    }

    /* trace l'empilement de l'element sur la Tour */
    public void empiler(Object d) throws ErreurPile {
    }

    /* trace le depilement de l'element de la Tour */
    public void depiler() throws ErreurPile {
    }

    public void affiche() {
	System.out.println(nom + ":"); super.affiche();
    }
}
