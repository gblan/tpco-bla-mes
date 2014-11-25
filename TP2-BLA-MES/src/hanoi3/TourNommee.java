package hanoi3;

/**
 * @author Guillaume
 *	classe parametrisee par T extends Empilable<? super T>, car on veux une tourNomee d'élements  ayant une super classe empilable
 * @param <T extends Empilable<? super T>>
 */
public class TourNommee<T extends Empilable<? super T>> extends Tour<T> {

	protected String nom;

	public TourNommee(int nb, String n) {
		super(nb);
		nom = n;
	}

	public void affiche() {
		System.out.println(nom + ":");
		super.affiche();
	}
}
