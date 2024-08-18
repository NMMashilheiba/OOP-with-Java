public class FixedPoint {
	public static void main(String[] args) {
		int scalingFactor = 1000;

		int a = (int) (10.11 * scalingFactor);
		int b = (int) (1.911 * scalingFactor);

		int sum = a + b;

		double result = (double) sum / scalingFactor;

		System.out.println("Result: " + result);
	}
}
