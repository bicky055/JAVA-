
package conditionalswitchcase;

import java.util.Scanner;

public class ConditionalSwitchCase {

    public static void main(String[] args) {
  // this ifelse is not good and its slower to switch codition     
        /*int n=3;
       
       if(n==1)
       {
           System.out.println("one");
       }
       else if(n==2)
       {
           System.out.println("Two");
       }
       else if(n==3)
       {
           System.out.println("Trhee");
       }
       else {
           System.out.println("invailid");
       }*/
        
        //so now we using switch codition
        
        /*int n=1;
    
         switch(n)
       {
         case 1:
            System.out.println("one");
            break;
         case 2:
            System.out.println("Two");
            break;
         case 3:
            System.out.println("Three");
            break;
         default :
            System.out.println("invailid");
        }*/
        
     /* Display name of a day based on name*/   
     int day;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the day");
     day =sc.nextInt();
     
     switch(day)
     {
         case 1: System.out.println("mon");
                 break;
         case 2: System.out.println("Tue");
                 break;
         case 3: System.out.println("Wed");
                 break;
         case 4: System.out.println("Thu");
                 break;
         case 5: System.out.println("Fri");
                 break;
         case 6: System.out.println("Sat");
                 break;
         case 7: System.out.println("Sun");
                 break;
         default : System.out.println("Invalid Day");
     }
     
        /* Display name of a Month based on name*/  
        
        int month;
     Scanner sc1=new Scanner(System.in);
     System.out.println("Enter the day");
     month =sc1.nextInt();
     
     switch(month)
     {
         case 1: System.out.println("janury");
                 break;
         case 2: System.out.println("febuary");
                 break;
         case 3: System.out.println("march");
                 break;
         case 4: System.out.println("april");
                 break;
         case 5: System.out.println("may");
                 break;
         case 6: System.out.println("june");
                 break;
         case 7: System.out.println("july");
                 break;
         case 8: System.out.println("August");
                 break;
         case 9: System.out.println("September");
                 break;
         case 10: System.out.println("October");
                 break;
         case 11: System.out.println("November");
                 break;
         case 12: System.out.println("December");
                 break;        
         default : System.out.println("Invalid month");
     }
     
     /* Find the  webside Domain name*/
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Domain name");
     String domain=scan.nextLine();
     
     String ext=domain.substring(domain.lastIndexOf(".")+1);
     
     switch(ext)
     {
         case "com": System.out.println("Commercial");
                     break;
        case "org": System.out.println("Organisation");
                     break;
        case "net": System.out.println("Networlk");
                     break; 
        case "gov": System.out.println("Goverment");
                     break; 
        default :   System.out.println("Invalid domain");
     }       
    
     
     
     
    }
    
}
