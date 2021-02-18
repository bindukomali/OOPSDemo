
public class PersonTest {

 

    public static void main(String[] args) {
    	 Person objPerson=new Person();// invoke default constructor
         Person objPerson1=new Person("komali",24,"vijayawada");
         Person objPerson2=new Person("satish",27,"hyderabad");//invoke parameterised constructor
        objPerson.input();
        objPerson.print();
        objPerson1.print();
        objPerson2.print();
    }

 

}
 