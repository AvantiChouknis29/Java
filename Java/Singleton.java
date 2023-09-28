public class Singleton {

    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code (if needed)
    }

    // Public static method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and data members of the singleton class can be added here
    public void showMessage() {
        System.out.println("Singleton instance is working.");
    }

    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call methods on the singleton instance
        singleton.showMessage();
    }
}
