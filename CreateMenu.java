
package creactmenu;

import java.util.Scanner;
public class CreactMenu {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
       sc.nextLine();
 //next line main jane k liye use kr rhe hai nhi to direct program se hi nikl jayega        
        System.out.println("Enter option in words ");
        String options=sc.nextLine();
        options=options.toUpperCase();
        
        switch(options)
        {
            case "ADD": System.out.println("sum is "+(x+y));
                         break;
            case "SUB": System.out.println("subtraction is "+(x-y));
                         break;             
            case "MUL": System.out.println("Multiplication is "+(x*y));
                         break;             
            case "DIV": System.out.println("Division is "+(x/y));
                         break;   
            default   : System.out.println("Invaild statement");
        }      
        
    }
    
}
