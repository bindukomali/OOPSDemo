import java.util.Scanner;

class Trainee     // class declaration or instance class          Abstraction
{
    int tId; //properties
    String tName;
    String technology;
    float salary;
    float stipend;
    
    //define methods
    void input()
    { 
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter ID,Name,Technology & Salary of the Trainee :");
        tId=s.nextInt();
        tName=s.next();
        technology=s.next();
        salary=s.nextFloat();
    }
    
    float calculate()
    {
        stipend=salary-200;
        return stipend;
    }
    void display()
    {
        System.out.println("*******TRAINEE DETAILS********");
        System.out.println("TRAINEE ID   : "+tId);
        System.out.println("TRAINEE NAME : "+tName);
        System.out.println("TECHNOLOGY   : "+technology);
        System.out.println("TStipend     : "+salary);
    }
}

 

public class TestTrainee 
{
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        Trainee t1=new Trainee(); //create objects of trainee
        Trainee t2=new Trainee();
        
        t1.input();               //method call
        t2.input();
        
        float s1=t1.calculate();
        float s2=t2.calculate();
        
        t1.display();
        System.out.println("TStipend     : "+s1);
        t2.display();
        System.out.println("TStipend     : "+s2);
    }

 

}