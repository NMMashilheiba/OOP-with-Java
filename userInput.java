import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s1 = input.next();
		//input.skip("\n");	// skip the newline char in the input stream
		input.nextLine();    // also discard the prev. leftover from the i/ stream
		String s2 = input.nextLine();

		// System.out.println(input);	// Error

		System.out.println("b s1: ");
		System.out.println(s1);
		System.out.println("B s2");
		System.out.println(s2);
	}
}