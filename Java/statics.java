
//Static:Used when we want method,var,class to be Independent of obj.

public class statics {
    
    public static class Human{
        int age;
        String name;
        static int population =1;
    
     public Human(int age,String name){
        this.age=age;
        this.name=name;
        
    }


}
public static void main(String[] args) {
    Human avanti = new Human(21, "Avanti");
    System.out.println(avanti.population);

    //We can use class name instead of "this"
    Human arya = new Human(21, "arya");
        System.out.println(Human.population); 
       
    }
}