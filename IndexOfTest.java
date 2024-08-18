public class StringFuncs {
	public static void main(String[] args) {
		String funnyStr = "Computer!Science,!long!walk!on!the!beach";
		int a = funnyStr.indexOf(97);	// ASCII value of 'a' == 97
		int b = funnyStr.indexOf('!');	// '!' == 33
		int c = funnyStr.indexOf("!");
		int d = funnyStr.indexOf("!Science");
		int e = funnyStr.indexOf("!Sience,!long", 4);
		String newString = new String(funnyStr.replace('!', ' '));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(newString);
	}
}
