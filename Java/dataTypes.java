public class dataTypes {
    public static void main(String[] args) {
        int a = 12;
        float b = 1.23f;
        boolean c = true; // Note: Use lowercase 'boolean' for boolean values
        char d = 'a';
        String e = "Avanti";
        double f = 1.31739341;
        long g = 127635318L; // Note: Use uppercase 'L' for long values
        short h = 123;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);

        // Typecasting
        a = (int) g;
        g = a;

    }
}
