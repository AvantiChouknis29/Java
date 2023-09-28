public class Wrappers {
    public static void main(String[] args) {
        int a=12;
        Integer c=121;
        Integer d=13;

        //To check if c>d=1 & c<d=-1
       int i=c.compareTo(d);
       System.out.println(i);

      System.out.println(d.equals(c));


      //Strings 
      String e="Avanti";
      String f="Arya";
      System.out.println(e.charAt(1));
      System.out.println(f.contentEquals(e));


      //Boolean
      Boolean g=Boolean.FALSE;
      System.out.println(g);




    }
}
