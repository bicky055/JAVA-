
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
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class Circle {

    
    public static void main(String[] args) 
    {
        Rectangle1 r=new Rectangle1();//object 1
        Rectangle1 r1=new Rectangle1();//object 2
        r.length=10;
        r.breadth=20;
      
        r1.length=15;
        r1.breadth=15;
        
        System.out.println("Area :"+r.area());
        System.out.println("perimeter :"+r.perimeter());
        System.out.println("its a square"+r.isSquare());
        
        System.out.println("Area :"+r1.area());
        System.out.println("perimeter :"+r1.perimeter());
        System.out.println("its a square"+r1.isSquare());
    }
    
}
