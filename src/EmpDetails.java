public class EmpDetails
{
    String name,address;
    int year;
    public EmpDetails(String name,int year,String address)
    {
        this.name=name;
        this.year=year;
        this.address=address;
    }
    void display()
    {
        System.out.println(name+"        "+year+"           "+address);
    }
    
    public static void main(String[] args) 
    {
        
        EmpDetails obj1=new EmpDetails("Robert  ",1994,"   64-C WallsStreet");
        EmpDetails obj2=new EmpDetails("Sam     ",2000,"   68-D WallsStreet");
        EmpDetails obj3=new EmpDetails("John    ",1999,"   26-B WallsStreet");
        System.out.println("name        year of joining           address");
        obj1.display();
        obj2.display();
        obj3.display();

 

        

 

    }

 

}

