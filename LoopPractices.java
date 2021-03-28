
package loopspractices;

import java.util.Scanner;

public class LoopsPractices {

    
    public static void main(String[] args) {
        /*While Loop*/
        /*int i=1;
        while(i<100)
        {
            System.out.println(i);
            i=i*2;
        }*/
        
        /* Do-While loop*/
        /*int i=1;
        do
        {
            System.out.println(i);
            i=i*2;
        }while(i<100);*/
        
        /*byte i=1;
        while(true)
        {
            System.out.println(i);
            i++;
        }
        //this is never get print bcz while loop is infinite 
        System.out.println("hello");*/
        
        /* For Loop */
        
        /*for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        for(int i=10;i>0;i--)
        {
            System.out.println(i);
        }*/
        
        // Initilication and updation ko loop se bahar likh skte hai but
        // coditions ko likhenge to loop infinite ho jayega 
        /*int i=1;
        for(;i<=10;)
        {
            System.out.println(i);
            i++;
        }*/
        //u cna initilise two vareable but same datatype
        /*for(int i=1,j=1;i<=10;i++,j=j*2)
        {
            System.out.println(i+" "+j);
        }*/
        
        /*Student challenge to For loop*/
        
        // 1. Display multiplication table
         
        /*Scanner sc2=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc2.nextInt();
        
         for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }*/
        
        //Find sum of n natural number
        /*int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           sum=sum+i;
        }
        System.out.println("Sum is "+sum);*/
        
        //Find the Factorial of n number
        
        /*long fact=1;
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc1.nextInt();
        
        for(int i=1;i<=n;i++)
        {
           fact=fact*i; 
        }
        System.out.println("Factorial is "+fact);*/
        
        /* Students Challenge ti While loop*/
        
        //Display Digits
        
        /*Scanner sc3=new Scanner(System.in);
        System.out.println("Enter Digits");
        int n=sc3.nextInt();
        
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            System.out.println(rem);
        }*/
        
        // Counts Digits of a number 
        
        /*Scanner sc4=new Scanner (System.in);
        System.out.println("Enter Digits");
        int n=sc4.nextInt();
        int count=1;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            if(n!=0)
                count++;
        }
        System.out.println("number of digits are "+count);*/
        
        //Find a number is Armstrong or not
        
        /*Scanner sc5=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc5.nextInt();
        int rem,res=0,m;
        m=n;
        while(m>0)
        {
             rem=m%10;
            res+=rem*rem*rem;
            m/=10;   
        }
        if(res==n)
            System.out.println("the number is Armstrong "+n);
        else
            System.out.println("the number is not Armstrong "+n);*/
        
        // Reverse of a number
        
        /*Scanner sc5=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc5.nextInt();
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Reverse number is "+rev);*/
        
        //check a num is Palindrome or not
        
        /*Scanner sc6=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc6.nextInt();
        int rem,m,rev=0;
        m=n;
        while(m>0)
        {
           rem=m%10;
           rev=rev*10+rem;
           m/=10;
           
        }
        
        if(rev==n)
            System.out.println("its a palidrome "+n);
        else
            System.out.println("its not a palidrome "+n);*/
        
        //7** Display number in words
        
        /*Scanner sc7=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc7.nextInt();
        int r;
        
        String str="";
        
        while(n>0)
        {
            r=n%10;
            n/=10;
            str=str + r; 
        }
        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0':System.out.print("Zero ");
                        break;
                case '1':System.out.print("One ");
                        break;
                case '2':System.out.print("Two ");
                        break;
                case '3':System.out.print("Three ");
                        break;        
                case '4':System.out.print("Four ");
                        break;
                case '5':System.out.print("Five ");
                        break;        
                case '6':System.out.print("Six ");
                        break;        
                case '7':System.out.print("Seven ");
                        break;        
                case '8':System.out.print("Eight ");
                        break;
                        
                case '9':System.out.print("Nine ");
                        break;        
            }
        }*/
        
            /*Display AP.Series*/
            
        /*Scanner sc8=new Scanner(System.in);
        System.out.println("Printe the AP Series");
        System.out.println("Enter a , d,and n");
        int a=sc8.nextInt();
        int d=sc8.nextInt();
        int n=sc8.nextInt();
        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term +",");
            term=term+d;
        }*/
        
           /* Display GP.series */
           
        /*Scanner sc9=new Scanner(System.in);
        System.out.println("Program to the GP Series");
        System.out.println("Enter a ,r,and n");
        int a=sc9.nextInt();
        int r=sc9.nextInt();
        int n=sc9.nextInt();
        int term=a;
        
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term*r;
        }*/
        
           /* Display fibonacci Series*/
           
        /*Scanner sc10=new Scanner(System.in);
        System.out.println("program to fibonacci series");
        System.out.println("Enter the number of terms");
        int n=sc10.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
            
        }*/
        
             /* Nested Loop
             (1,1) (1,2) (1,3) (1,4) 
             (2,1) (2,2) (2,3) (2,4) 
             (3,1) (3,2) (3,3) (3,4) 
             (4,1) (4,2) (4,3) (4,4) 
             (5,1) (5,2) (5,3) (5,4) */
             
        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print("("+i+","+j+") ");
            }System.out.println("");
        }*/
        
        /* now print 1.pattern
           1 2 3 4 5 
           1 2 3 4 5 
           1 2 3 4 5 
           1 2 3 4 5 
           1 2 3 4 5 */
        
        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }System.out.println("");
        }*/
           /* 2.Pattern
             1 1 1 1 1 1 1 
             2 2 2 2 2 2 2 
             3 3 3 3 3 3 3 
             4 4 4 4 4 4 4 
             5 5 5 5 5 5 5 */
            
        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=7;j++)
            {
                System.out.print(i+" ");
            }System.out.println("");
        }*/
         
            /* 4.Pattern 
              2 3 4 5 6 7 8 
              3 4 5 6 7 8 9 
              4 5 6 7 8 9 10 
              5 6 7 8 9 10 11 
              6 7 8 9 10 11 12 */
        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=7;j++)
            {
                System.out.print(i+j+" ");
            }System.out.println("");
        }*/
                
             /* 5.Pattern 
              01 02 03 04 05 
              06 07 08 09 10 
              11 12 13 14 15 
              16 17 18 19 20 
              21 22 23 24 25  */ 
             
          /*int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.format("%02d ",++count);
            }System.out.println("");
        }*/
             /*6.Pattern 
              1 
              1 2 
              1 2 3 
              1 2 3 4 
              1 2 3 4 5  */
             
          /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }System.out.println();
        } */
          /*7.Pattern
             1 
             2 3 
             4 5 6 
             7 8 9 10 
             11 12 13 14 15 */
             /* '*'pattren
             * 
             * * 
             * * * 
             * * * * 
             * * * * * "*/
           
          /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }System.out.println();
        }*/
          
          /*8.Pattern 
            1 2 3 4 5 
            1 2 3 4 
            1 2 3 
            1 2 
            1      */
          /*int i,j;
          for( i=1;i<=5;i++)
        {
            for(j=1;j<=6-i;j++)
            {
                System.out.print(j+" ");
            }System.out.println();
        }*/
          
          /* print the pattren
           * * * * * 
             * * * * 
               * * * 
                 * * 
                   *     */
          
          /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i<=j)
                System.out.print("* ");
                else
                    System.out.print("  ");
                    
            }System.out.println();
        }*/
        
             /* print pattern
                         * 
                       * * 
                     * * * 
                   * * * * 
                 * * * * *   */
             
          /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i+j>5)
                System.out.print("* ");
                else
                    System.out.print("  ");
                    
            }System.out.println();
        }*/
          
          for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                for(int k=1;k<=5;k++)
                        {
                           if(i+j>5)
                System.out.print("* ");
                else
                    System.out.print("  "); 
                        }
                    
            }System.out.println();
        }
          
    }
    
}
