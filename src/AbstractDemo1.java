abstract class Shape{
String objectName = " ";
Shape(String name)
{
this.objectName = name;

 

}
public void moveTo(int x ,int y)
{
System.out.println(this.objectName +" "+ "has been moved to"+"x ="+ x +"and y =" +y);
}
//abstract method which will be implemented by its subclasses

 

abstract public double area();
abstract public void draw();
}

 

class Rectangle extends Shape
{
int length , width;
//constructor
Rectangle(int length , int width , String name)
{
super(name);
this.length = length;
this.width = width;
}

 

public void draw()
{
System.out.println("Rectangle has been drawn");

 }

 

public double area()
{
return (double)(length * width);
}

 }

 

class circle extends Shape
{
double pi = 3.14;
int radius;

circle(int radius , String name)
{
super(name);
this.radius = radius;

}

public void draw()
{
System.out.println("Circle has been drawn");
}

public double area()
{
return (double)((pi* radius *radius )/2);
}
}

 

public class AbstractDemo1 {

	 

public static void main(String[] args) {
// Creating the object of Rectangle class and usinf shape class reference


Shape rect = new Rectangle(2, 3 , "Rectangle");
System.out.println("Area of rectangle = "+rect.area());
rect.moveTo(1,2);
System.out.println(" ");

//Creating the object of circle class
Shape Circle = new circle(2,"Circle");
System.out.println("Area of circle = "+Circle.area());
rect.moveTo(2,4);

}

 

}