public class MCAtest {
    public void add(int x, int y) {
        System.out.println("Sum is: " + (x + y));
    }

    public void add(int x, int y) {
        System.out.println("Sum is: " + (x - y));
    }

    public static void main(String[] args) {
        MCAtest obj = new MCAtest();

        obj.add(5, 3);
    }
}

































// // Define the first class 'Person'
// class Person {
//     // Fields (attributes)
//     String name;
//     int age;
//     int nine = 9;

//     // Constructor
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Method to display person information
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// // Main class where the program runs
// public class MCAtest {
//     public static void main(String[] args) {
//         // Create an instance (object) of the Person class
//         Person person1 = new Person("Alice", 25);

//         // Call the method to display person's information
//         person1.displayInfo();
//         System.out.println(person1.name + person1.age + person1.nine);
//     }
// }
