
package stringpractice1.java;


public class StringPractice1Java {

    
    public static void main(String[] args) {
        
        //Method 1
        //String str=new String("netbeans");
        
        //System.out.println(str.length());
        
        //String str=new String("netbeans");
        //int len=str.length();
        //method 2 to write lenght of String 
        //System.out.println(len);
        
        //method 3
        //change lower to upper case latter of String
        
        //String str=new String("bicky");
        //String str1=str.toUpperCase();
        //here u can use direct str=str.toUpperCase();
        //System.out.println(str1);
        
        //String str=new String("    welcome   ");
        //System.out.println(str);
        //str=str.trim();
       //System.out.println(str);
       
       //String str=new String("welcome");
       //String str2=str.substring(3);
       //System.out.println(str2);
       
       //String str=new String("welcome bicky");
       //String str2=str.substring(3,13);
       //System.out.println(str2);
       
       //String str=new String("welcome bicky");
       //String str2=str.replace('b','v');
       //System.out.println(str2);
       
       //String str="Mr. Bicky Jha";
       //System.out.println(str.startsWith("Mr."));
       //m-2
       //String str="Mr. Bicky Jha";
       //System.out.println(str.startsWith("Bicky",4));
       //m-3
       //String str1="Mr. Bicky Jha";
       //System.out.println(str1.endsWith("Jha"));
       
       //String str1="Mr. Bicky Jha";
       //System.out.println(str1.charAt(4));
       
       //String str2="Mr. Bicky Jha";
       //for(int i=4;i<str2.length();i++)
       //System.out.print(str2.charAt(i));
           
       //String str="www.udemy.co.in";
       //System.out.println(str.indexOf('.'));
           
       //String str="www.udemy.co.in";
       //System.out.println(str.indexOf("co"));
           
       //String str="www.udemy.co.in";
        //System.out.println(str.indexOf(".",4));
            
        //String str1="www.udemy.co.in";
        //System.out.println(str1.lastIndexOf(".",4));
            
       //String str1="pyramid";
       //String str2="pyramid";
       //System.out.println(str1.equals(str2));
            
       //String str1="java";
       //String str2="python";
       //String str3="python";
       //System.out.println(str2.equalsIgnoreCase(str3));
            
       //String str1="java";
       //String str2="python";
      //String str3="python";
      //System.out.println(str2==str1);
            
      //String str1="java";
      //String str2="python";
      //String str3="python";
      //System.out.println(str2.equalsIgnoreCase(str3));
            
      //String str1="pyramid";
      //String str2=new String("pyramid");
     //false bcz here new means object(pyramid ) will creating in heap
     //System.out.println(str1==str2);
     //here str1==str2 means it will cheack address of object
            
      //String str1="pyramid";
      //String str2=new String("pyramid");
     //System.out.println(str1.equals(str2));
     //but here it will be cheack containt of object.
            
     //String str1="pyramid";
    //String str2=new String("Pyramid");
    //System.out.println(str1.compareTo(str2));
    //here capital P in(str1) 1st then small p in (str2) so result is positive
            
    //String str1="Pyramid";
    //String str2=new String("pyramid");
   //System.out.println(str1.compareTo(str2));
   //here small p in(str1) 1st then captal P (str2) so result is negative
          
  //String str1="Pyramid";
  //String str2=new String("China wall");
  //System.out.println(str1.compareTo(str2));
          
          //String str1="China tall";
          //String str2=new String("China all");
          //System.out.println(str1.compareTo(str2));
          
          //String str1="China tall";
          //String str2=new String("China tall");
          //System.out.println(str1.compareToIgnoreCase(str2));
          
          //String str1="China tall";
          //System.out.println(str1.contains("tall"));
          
          //String str1="bicky kumar";
          //String str2=" jha ";
          //System.out.println(str1.concat(str2));
          
          //metod-2(concatinations)
          //String str1="bicky kumar";
          //String str2=" jha ";
          //System.out.println(str1 + str2);
          
                 //*Matching Symbols*//
          
          //String str1="f"; // use also single no's(1,2...9)
          //System.out.println(str1.matches("."));
          //here result will be true
          //String str1="sd";
          //System.out.println(str1.matches("."));
          //here result will be false bcz tow char here  
          
         //String str1="2";
         //System.out.println(str1.matches("[123]"));
        //it is only use for single string charachter
        
       //String str1="s";
       //System.out.println(str1.matches("[^abc]"));
       //here ^ means other then abc so its will be true
        
         //String str1="3";
         //System.out.println(str1.matches("[a-z0-9]"));
         //here u give up to rang so true 
         
          //String str1="d2";
          //System.out.println(str1.matches("[a-z][0-9]"));
         //here u give tow rang so it is also true 
         
        //String str1="2j";
        //System.out.println(str1.matches("[a-z][0-9]"));
        //here false bcz 1st u will use rang of a-z then 1-9
           
        //String str1="d";
        //System.out.println(str1.matches("a|b|c|d"));
        
        //String str1="ab";
        //System.out.println(str1.matches("abc"));
        
        //String str1="6";
        //System.out.println(str1.matches("\\w"));
        //here '\\w' use for any digit and alptabet 
        
        //String str1="5";
        //System.out.println(str1.matches("\\d"));
        //here '\\d' use for only digits
        
        //String str1="s";
        //System.out.println(str1.matches("\\D"));
        //here '\\D' capital D is use for not a digits 
        
        //String str1="$";
        //System.out.println(str1.matches("\\W"));
        //here '\\W' capital W means other then digits and alphabet
        
        //String str1=" ";
        //System.out.println(str1.matches("\\s"));
        //here '\\s' is use for only space 
        
        //String str1="s";
        //System.out.println(str1.matches("\\S"));
        //here capital '\\S' use for not a space
        
                //*Quantifiers*//
                
        //String str1="abcdef";
        //System.out.println(str1.matches(".*"));
        //here '.*' means any number is allows
        //if giving space then it is also true like-"ascc aaad"
        
        //String str1="abcddef";
        //System.out.println(str1.matches("[a-z]*"));
        //here ato z any numbre is allow but here space is not allow
        
        //String str1="abcdef244";
        //System.out.println(str1.matches("[a-z][0-9]*"));
        //here o\p is false 
        
        //String str1="abccbcbbcaabcca";
        //System.out.println(str1.matches("[abc]*"));
        //here use any patern of abc   
        
        //String str1="abcbbbcccaacacabacabac";
        //System.out.println(str1.matches("[abc]+"));
        //here also true + means one or more and * means  0 or more  
        
        //String str1="";
        //System.out.println(str1.matches("[abc]*"));
       //here ture bcz * means 0 or more
        
        //String str1="";
       //System.out.println(str1.matches("[abc]+"));
       //here false bcz + means one or more 
       
       //String str1="acb";
       //System.out.println(str1.matches("[abc]{3}"));
       //here rang of string is only 3 bcz S.o.p ({3}) 
       
       //String str1="ab";
       //System.out.println(str1.matches("[abc]{3}"));
       //here false exitly 3 latter use in length of string
       
       //String str1="abacb";
       //System.out.println(str1.matches("[abc]{3,7}"));
       //true bcz rang of string is 3 to 7
       
       //String str1="";
       //System.out.println(str1.matches("[abc]{0,6}"));
       //here also true
       
       //String str1="bickyjha055@gmail.com";
       //System.out.println(str1.matches(".*gmail.com"));
       //true 
       //String str1="bickyjha055@gmail.com";
       //System.out.println(str1.matches(".*gmail.*"));
       
       //String str1="bickyjha055@gmail.com";
       //System.out.println(str1.matches("\\w*@gmail(.*)"));
       
        
    }
    
}
