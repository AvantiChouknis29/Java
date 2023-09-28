public class Inheritances {
    public static void main(String[] args) {
        // Create an instance of Avanti
        Avanti avanti = new Avanti("John");
        
        // Call methods
        avanti.walk();
        System.out.println(avanti.name);
    }

    // Person class
    static class Person {
        String name;

        // Constructor
        Person(String name) {
            this.name = name;
        }

        // Method
        void walk() {
            System.out.println("Can Walk");
        }
    }

    // Avanti class extends Person
    static class Avanti extends Person {
        Avanti(String name) {
            // Call the parent class constructor using super
            super(name);
        }
    }
}
