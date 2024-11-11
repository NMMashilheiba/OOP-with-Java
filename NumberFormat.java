// Currency Demo
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyDemo {
	public static void main(String[] args) {
		int items;
		double itemCost, total;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of items you bought: ");
		items = input.nextInt();

		System.out.println("Enter the cost per item: ");
		itemCost = input.nextDouble();

		total = items * itemCost;

		System.out.println();
		System.out.println("Unformated Total: " + total);
		System.out.printf("Unformated Total: %d", total);

		// creating an obj of NumberFormat class
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Formated Total: " + currencyFormat.format(total));
	}
}