public class fixedPoint {
	public static void main(String[] args) {
		int scalingFactor = 10;

		int a = (int) (10.11 * scalingFactor);
		int b = (int) (1.9 * scalingFactor);

		int sum = a + b;

		double result = (double) sum / scalingFactor;

		System.out.println("Result: " + result);
	}
}
