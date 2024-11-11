public class StringStringBuffer {
    public static void main(String[] args) {
        // String: Immutable
        String str = "Hello";
        str.concat(", World!"); // No change to the original string
        System.out.println("String str.concat(\", world!\"): " + str.concat(", world!"));
        System.out.println("String (after concat): " + str); // Output: Hello

        // StringBuffer: Mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", World!"); // Modification in-place
        System.out.println("StringBuffer (after append): " + sb); // Output: Hello, World!
    }
}
 