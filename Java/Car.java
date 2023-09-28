//Class-It is not a actual entity it is a template.
//Obj-Instance of class,real entity,occupies space in memory--->state,identity and behavior
public class Car {
   public String engine;
    private double price;
    private int seats;
    private Boolean subsidy;
    // Constructor to initialize car attributes
    public Car(String engine, double price, int seats) {
        this.engine = engine;  
        this.price = price;
        this.seats = seats;
        this.subsidy=subsidy;

        
    }
    //Constructor inside a constructor
    public Car(String engine,String price,int seats){
        this(engine,23893,0);
    }
    public static void start() {
        // You can access static fields in a static method
        System.out.println("Starting the car.");
    }

    public static void main(String[] args) {
       Car Maruti=new Car("petrol",1200000,4);
       Car Ferrari = new Car("Disel",2200000,2);
       Car Tesla = new Car(null, 100000000, 2);
       Car Audi= new Car("Disel",null,2);
       
       Maruti.seats=6;
       System.out.println(Maruti.seats);

       System.out.println(Tesla.engine);
        System.out.println(Tesla.price);
        System.out.println(Tesla.seats);
         System.out.println(Audi.price);
          System.out.println(Audi.price);
        
         start();

    }

}
