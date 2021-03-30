
package array;

import java.util.Scanner;

public class Array {

    
    public static void main(String[] args) {
        //initialize and diclear an array
        /*int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int C[];
        C=new int[10];
        int D []=new int [12];// u can write like that also 
        
         B[2]=15;// insert the value 
         for(int i=0;i<A.length;i++)
         {
             System.out.println(A[i]);
         }
         
         for(int i=0;i<B.length;i++)
         {
             System.out.print(B[i]+",");
         }
         
         //For Each loop
         
         for(int x:B)
         {
             System.out.println(x);
         }
         for(int x:B)
         {
             System.out.println(x++);//no change here
         }*/
         
         /*for(int i=0;i<B.length;i++)
         {
             System.out.println(B[i]++);
         }
         //now here value of B[] is modify 
         for(int x:B)
         {
             System.out.println(x);
         }
         //print array length
         System.out.println(B.length);*/
         
            /* Student Challenge */
            /*1. Find the sum of Array*/
            
            /*int A[]={1,2,3,4,5,6,7,8,9,10};
            int sum = 0;
            for(int x:A)
            {
                sum=sum+x;
            }
            System.out.println("Array sum is "+sum);
            
            for(int i=0;i<A.length;i++)
            {
                sum=sum+A[i];
            }
            System.out.println("Array sum is "+sum);*/
            
           /*int A[]={2,5,3,4,6,8,7,1,45,30,52};
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter a key element");
           int key=sc.nextInt();
           for(int i=0;i<A.length;i++)
           {
               if(A[i]==key)
               {
                   System.out.println("key is found at "+i);
                   System.exit(0);
               }
               
           }
           System.out.println("key is not found");*/
           
           /* Find the largest element of Array */
           
           /*int A[]={2,5,3,4,6,8,710,1,45,304,52};
           int max=A[0];
           for(int i=0;i<A.length;i++)
           {
               if(max<A[i])
               {
                   max=A[i];
                   
               }
           }
           System.out.println("Maximum Element is "+max);*/
           
           /* Find the 2nd largest element of Array */
           
           /*int A[]={2,5,3,4,6,800,71,1,45,304,52};
           int max1=A[0],max2=A[0];
           for(int i=0;i<A.length;i++)
           {
               if(max1<A[i])
               {
                  max2=max1;
                  max1=A[i];
               }
               else if(max2<A[i])
               {
                   max2=A[i];
               }
           }
           System.out.println("2nd Maximum Element is "+max2);*/
           
           /* Rotation of Array element left rotation */
           
           /*int A[]={2,4,8,10,12,14,16,18,20};
           for(int x:A)
               System.out.print(x+",");
             System.out.println("");
           int temp=A[0];
           for(int i=1;i<A.length;i++)
           {
               A[i-1]=A[i];
           }
           A[A.length-1]=temp;
           for(int x:A)
               System.out.print(x+",");
             System.out.println("");*/
           
           /* Rotation of Array element right rotation */
           
           /*int A[]={2,4,8,10,12,14,16,18,20};
           for(int x:A)
               System.out.print(x+",");
             System.out.println("");
           int temp=A[A.length-1];
           for(int i=A.length-2;i<=1;i--)
           {
               A[i+1]=A[i];
           }
           A[0]=temp;
           for(int x:A)
               System.out.print(x+",");
             System.out.println("");*/
           
           /*  Insert Element in An Array */
           
           /*int A[]=new int[10];//Array length
           int n=6;//Array elements
           A[0]=5;A[1]=7;A[2]=3;A[3]=4;A[4]=9; A[5]=12;
  
           for(int i=0;i<n;i++)
               System.out.print(A[i]+",");
           System.out.println("");
           int x=10;//Inserting element
           int index=3;//which A[index]
           for(int i=n;i>index;i--)
           {
               A[i]=A[i-1];
           }
           A[index]=x;
           for(int b:A)
           {
               System.out.print(b+",");
           }
           
            System.out.println("");*/
           
           /* Delete Element in An Array */
           
           /*int A[]=new int[10];//Array length
           int n=6;//Array elements
           A[0]=5;A[1]=7;A[2]=3;A[3]=4;A[4]=9; A[5]=12;
  
           for(int i=0;i<n;i++)
               System.out.print(A[i]+",");
             System.out.println("");
  
           int index=2;//which A[index] element delete
           A[n]=A[2];
           for(int i=index;i<n;i++)
           {
               A[i]=A[i+1];
           }
           
           for(int i=0;i<n;i++)
           {
               System.out.print(A[i]+",");
           }*/
           
           /* Copy an Array */
           
           /*int A[]={2,4,5,7,8,9,6,10,12,11};
           int B[]=new int[10];
           
           for(int i=0;i<A.length;i++)
           {
               B[i]=A[i];
           }
           for(int i=0;i<B.length;i++)
           {
               System.out.print(B[i]+" ");
           } System.out.println("");*/
           
           /* Reverse an Array */
           
           /*int A[]={1,2,3,4,5,6,7,8,9,10};
           int B[]=new int[10];
           
           for(int i=A.length-1,j=0;i>=0;i--,j++)
           {
               B[j]=A[i];
           }
           
           for(int i=0;i<B.length;i++)
           {
               System.out.print(B[i]+" ");
           } System.out.println("");*/
           
           /* Increasing the size of an Array */
           
           /*int A[]={1,2,3,4,5};
           int B[]=new int[2*A.length];
           System.out.println("length of A = "+A.length);
           
           for(int i=0;i<A.length;i++)
           {
               B[i]=A[i];
           }
           A = B;
           B=null;
           System.out.println("length of A = "+A.length);*/
           
                 /*  2-D Array  */
                 
               /*Diclaretion of Array*/ 
         /*int A[][]=new int[5][5];
         
         int B[][]={{1,2,3},{2,4,6},{1,5,9}};
         
         int C[][];
         C=new int[5][5];
         
         int [] D[];//this is valid
         int []X,Y,Z,H;//here All are 1-D Array 
         int[]E,F[];
         //here E[] is single Dimension Array but F[][] is 2-D Array 
          E=new int[5];
          F=new int[5][4];*/
         
         /* Now Display Array by 2 method*/
         
          /*int A[][]=new int[5][5];
         
         int B[][]={{1,2,3},{2,4,6},{1,5,9}};
         
         for(int i=0;i<B.length;i++)
         {
             for(int j=0;j<B[2].length;j++)
             {
                System.out.print(B[i][j]+" ");
             }
             System.out.println("");
         }*/ 
             /*for(int x[]:B)
             {
                 for(int y:x)
                 {
                     System.out.print(y+" ");
                 }System.out.println("");
             }*/
             
              /* Jagged Array */ 
              
          /*int A[][];
          A=new int[3][];
          A[0]=new int[5];
          A[1]=new int[3];
          A[2]=new int[8];
          
          for(int i=0;i<A.length;i++)
          {
              for(int j=0;j<A[i].length;j++)
              {
                  System.out.print(A[i][j]+" ");
              }
              System.out.println("");
          }*/
          
          /*for(int x[]:A)
          {
              for(int y:x)
              {
                  System.out.print(y+" ");
              }
              System.out.println("");
          }*/
          
          /* Add 2 Matrix */
          
          /*int B[][]={{1,2,3},{4,5,6},{7,8,9}};
          int C[][]={{10,11,12},{13,14,15},{16,17,18}};
          
          int D[][]=new int[3][3];
          
          for(int i=0;i<B.length;i++)
          {
              for(int j=0;j<B[0].length;j++)
              {
                  D[i][j]=B[i][j]+C[i][j];
              }
                  
          }
          for(int x[]:D)
          {
              for(int y:x)
              {
                  System.out.print(y+" ");
              }
               System.out.println("");   
          }*/
              
          /* Multiply 2 Matrix */
          
          /*int B[][]={{1,2,3},{4,5,6},{7,8,9}};
          int C[][]={{1,0,0},{0,1,0},{0,0,1}};
          
          int D[][]=new int[3][3];
          
          for(int i=0;i<B.length;i++)
          {
              for(int j=0;j<B[0].length;j++)
              {
                   D[i][j]=0;
                  for(int k=0;k<3;k++)
                  {
                      D[i][j]=D[i][j] + B[i][k]*C[k][j];
                      
                  }
              }
                  
          }
          for(int x[]:D)
          {
              for(int y:x)
              {
                  System.out.print(y+" ");
              }
               System.out.println("");   
          }*/
          
          /* String Sorting By Using Array */
          
    String arr[]={"java","python","ruby","smalltalk","ada","basic","pascal"};   
           
      java.util.Arrays.sort(arr);
      
      for(String x:arr)
          System.out.print(x+",");
          System.out.println("");
         
         
    }
    
}
