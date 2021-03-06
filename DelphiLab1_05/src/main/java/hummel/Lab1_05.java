package main.java.hummel;

public class Lab1_05 {

	public static void doCalcsWithEps(double limit) {
		double eps = 0;
		double x = 0.1;
		while (x < 1.0) {
			int k = 1;
			double f = 0;
			do {
				double temp = f;
				f += Math.pow(x, 3 * k + 1) / ((4 * k - 1) * (4 * k - 2));
				k += 1;
				eps = Math.abs(f - temp);
			} while (eps > limit);

			System.out.println("X = " + x + "; K = " + k + "; F =" + f);
			x += 0.1;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		doCalcsWithEps(1e-5);
		doCalcsWithEps(1e-6);
	}
}