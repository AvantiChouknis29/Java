final public class finalKeyword {
    public static void main(String[] args) {
        // final keyword cant be overriden
        final int value = 1;
        // value=3;

        printMessage(12);
        

    }

    final static void printMessage(final int a) {
        System.out.println("This is a final method." + a);
    }

    // Methods are not overriden
    final static void printMessage(final int a, int b) {
        System.out.println("I am good." + a + b);
    }

}
     
        
    

