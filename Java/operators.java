public class operators {
    public static void main(String[] args) {
        //Arthimetic
        int a=12;
        int b=11;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Bitwise
        System.out.println(a&b);
        System.out.println(a|b);
        Boolean c=a!=b;
        System.out.println(c);

        //Assignment
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a==b);

        //Comparison
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>=b);

        System.out.println(a+" "+b);
        //Logical
       if(a>b&&b==1){
        System.out.println("True");
       }
        
       if(a<b|| b==1){
         System.out.println("True");
       }

       System.out.println(a>>1);
        System.out.println(a<<1);

    }
}
