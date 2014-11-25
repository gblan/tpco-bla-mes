package hanoi3;

/**
 * @author Guillaume
 *  pas besoin d'apeller l'interface Empliable<Disque2>, car la classe ne saurait plus quel compareTo utiliser.
 *  donc on récupere l'implementation d'empilable par héritage.
 */
public class Disque2 extends Disque {

	private int val2;

	public Disque2() {
	}

	public void init(int v) {
		val = v;
		val2 = 2 * v;
	}

	public String toString() {
		return "Disque2[" + val + ", " + val2 + "]";
	}

	/*
	 * Une redefinition de compareTo juste pour montrer dans les traces qu'on
	 * appelle bien la bonne methode. La methode doit etre compatible avec la
	 * version de la super-classe (par exemple si on travaille sur une tour qui
	 * melange des instances de Disque et de Disque2)
	 */
	@Override
	public int compareTo(Disque arg0) {
		System.out.println("Disque2.compareTo");
		return super.compareTo(arg0);
	}

}
