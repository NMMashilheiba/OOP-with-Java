import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value and the day of the week: ");
        int fahrenheit = input.nextInt();
        // input.skip("\n");
        // System.out.print("Enter day: \n");
        String day = input.nextLine();
        // String day = input.nextLine().trim();  // nextLine() return the leading whitespaces and upto '\n' but (not including \n) 
        // String day = input.next();   // next() ignores the leading whitespaces and read "Monday" leaving only "\n"
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celsius: " + celsius);
    }
}
