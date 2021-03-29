
package relational;

import java.util.Scanner;
import java.util.*;


public class Relational {

    
    public static void main(String[] args) {
        
//        int a=10,b=5,c=15;
//        /* Relational operators*/
//        System.out.println(a>b);
//        System.out.println(a==b);
//        System.out.println(a!=c);
//        System.out.println(a<c);
        
        /* Logical operators*/
//        float a=10.5f,b=5,c=15;
//        System.out.println(a>b && a<c);
//        System.out.println(a<b || a<c);

        /* Conditional statement using both operators*/
        
        /*int n=5,m=-5;
        if(n>0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }*/
        
        /* now using multipal condition statement */
        
        /*find Maximum of three number*/
        
        /*int a=12,b=5,c=6;
        if(a>b && a>c)
        {
            System.out.println("Max is "+a);
        }
        else if(b>c)
        {
            System.out.println("max is "+b);
        }
        else
        {
            System.out.println("max is "+c);
        }*/

       /* Find number is Odd or Even */
       
      /* int n;
       //Given input by the user 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number ");
       n=sc.nextInt();
       
       if(n%2==0)
       {
           System.out.println("the number is Even "+n);
       }
       else {
           System.out.println("the number is Odd "+n);
       }*/
      
        /*Find the person is young or not young*/
        
       /*int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of person");
        age=sc.nextInt();
        
        if(age>=14 && age<=30)
        {
            System.out.println("the person is young");
        }
        else
        {
            System.out.println("the person is not young");
        }*/
       /*Find the grades of the student*/
       
       /*int m1,m2,m3;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the marks of the student ");
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       
       float avg=(float)(m1+m2+m3)/3;
       if(avg>70)
       {
           System.out.println("the Grade is 'A' " +avg);
       }
       else if(avg<=70 && avg>60)
       {
           System.out.println("the Grade is 'B' "+avg);
       }
       else if(avg<=60 && avg>50)
       {
           System.out.println("the Grade is 'C' "+avg);
       }
       else if(avg<=50 && avg>40)
       {
           System.out.println("the Grade is 'D' "+avg);
       }
       else if(avg<=40 && avg>30)
       {
           System.out.println("the Grade is 'E' "+avg);
       }
       else 
       {
           System.out.println("the student is Fail  "+avg);
       }*/
       
       /* Find the Radix of a number of given string */
       
       /*Scanner sc=new Scanner(System.in);
       String num;
       System.out.println("Enter a number");
       num=sc.nextLine();
       
       if(num.matches("[01]+"))
       {
           System.out.println("Binary Radix=2");
       }
       else if(num.matches("[0-7]+"))
       {
           System.out.println("Octal Radix=8");
       }
       else if(num.matches("[0-9]+"))
       {
           System.out.println("Decimal Radix=102");
       }
       else if(num.matches("[0-9A-F]+"))
       {
           System.out.println("Hexa Radix=16");
       }
       else
       {
           System.out.println("not a number");
       }*/
       
       /* Find the Given number is a leap year */
       
       /*int year;
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter a year");
       year=sc.nextInt();
       
       if(year%4==0)
       {
           if(year%100==0)
           {
               if(year%400==0)
               {
                   System.out.println("its leap year "+year);
               }
             else
                {
                   System.out.println("its not  leap year "+year);
                }
           }
           else
           {
               System.out.println("its leap year "+year);
           }
           
       }
       else
       {
           System.out.println("its not  leap year "+year);
       }*/
       
         /* Display name of a day based on name */
       
         /*Scanner sc=new Scanner(System.in);
         System.out.println("enter a day name");
         int day=sc.nextInt();
         
         if(day==1)
         {
             System.out.println("day is Mon");
         }
         else if(day==2)
         {
             System.out.println("day is Tue");
         }
         else if(day==3)
         {
             System.out.println("day is wed");
         }
         else if(day==4)
         {
             System.out.println("day is thu");
         }
         else if(day==5)
         {
             System.out.println("day is Fri");
         }
         else if(day==6)
         {
             System.out.println("day is Sat");
         }
         else if(day==7)
         {
             System.out.println("day is Sun");
         }
         else
         {
            System.out.println("day is not found"); 
         }*/
         
            /* Find the type webside and the protocol used*/
            
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the URL ");
        String url=scan.nextLine();
        
        String protocol=url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
        {
            System.out.println("Hypertext transfor protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File transfor protocol");
        }
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(ext.equals("org"))
        {
            System.out.println("Organisation");
        }
        else if(ext.equals("net"))
        {
            System.out.println("Network");
        }
        else if(ext.equals("gov"))
        {
            System.out.println("Goverment");
        }
    }
    
}
