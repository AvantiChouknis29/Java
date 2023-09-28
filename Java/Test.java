//Exp psvm

public class Test {
    public static void main(String[] a) {
        fun();
    }
  
    // nonstatic function inside static function 

    
    static void fun(){
        Test obj = new Test();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Greeted");
    }
}

