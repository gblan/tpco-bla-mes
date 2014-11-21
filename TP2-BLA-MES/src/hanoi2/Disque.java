package hanoi2;

public class Disque implements Empilable {
	private int val;

	@Override
	public int compareTo(Object arg0) {
		Disque d = (Disque) arg0;
		if (val > d.val) {
			return 1;
		} else if (val > d.val) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public void init(int nb) {
		this.val = nb;
	}

	@Override
	public String toString() {
		return "Disque[" + val + "]";
	}
}
