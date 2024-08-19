import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value and the day of the week: ");
        
        int fahrenheit = input.nextInt();

        input.skip("\n");
        
        System.out.print("Enter day: ");
        String day = input.nextLine();
        
        System.out.print("Enter prefered celsius label: ");
        String cText = input.nextLine();
        // String day = input.nextLine().trim();  // nextLine() return the leading whitespaces and upto '\n' but (not including \n) 
        // String day = input.next();   // next() ignores the leading whitespaces and read "Monday" leaving only "\n"
        
        double celsius = (5.0/9) * (fahrenheit - 32);
        
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celsius: " + celsius);

        // format specifier with printf(); "%[flag][width][.precision]type":
        System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit);
        System.out.printf("%s %-10s: %.2f\n", day, cText, celsius);

        // Using String's class format():
        String cOutput = String.format("%s %-10s: %.2f\n", day, cText, celsius);
        System.out.println(cOutput);
    }
}
