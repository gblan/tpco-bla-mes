package hanoi3;

public class Disque implements Empilable<Disque> {
	protected int val;

	public void init(int v) {
		val = v;
	}

	public String toString() {
		return "Disque[" + val + "]";
	}

	@Override
	public int compareTo(Disque arg0) {
		if (this.val < arg0.val) {
			return -1;
		} else if (this.val > arg0.val) {
			return 1;
		} else {
			return 0;
		}
	}
}
