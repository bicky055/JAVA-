
package Rectangle;

class Rectangle1
{
    // properties:
    public double length;
    public double breadth;
    //Methods: 
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
}

public class Circle {

    
    public static void main(String[] args) 
    {
        Rectangle1 c1=new Rectangle1();//object 1
        Rectangle1 c2=new Rectangle1();//object 2
        c1.length=10;
        c1.breadth=20;
      
        c2.length=15;
        c2.breadth=25;
        
        System.out.println("Area :"+c1.area());
        System.out.println("perimeter :"+c1.perimeter());
        
        System.out.println("Area :"+c2.area());
        System.out.println("perimeter :"+c2.perimeter());
    }
    
}
