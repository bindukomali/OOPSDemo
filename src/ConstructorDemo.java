public class ConstructorDemo {
    int id;
    
     ConstructorDemo()     //  default constructor
     {
     System.out.println("in constructor");
     id=10;
     }
     void display()
     {
         System.out.println(id);
     }
    public static void main(String[] args) {
        ConstructorDemo obj1=new ConstructorDemo();      // define objects & invokes constructor
        ConstructorDemo obj2=new ConstructorDemo();
        
        obj1.display();
        obj2.display();
        }
}