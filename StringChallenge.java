
package stringstudentchallenge;


public class StringStudentChallenge {

    
    public static void main(String[] args) {
        
                //challenges//
        
   //Find if the email id is on gmail
   //Fine username and domaian name from email    
//        String str="bickyjha055@gmail.com";
//        //if here hotmail then.. 
//        int i=str.indexOf("@");
//        
//        String uname=str.substring(0,i);
//        String domain=str.substring(i+1, str.length());
//        
//        System.out.println("username :"+uname);
//        System.out.println("Domain :"+domain);   
//         //..this o\p is false
//        System.out.println(domain.startsWith("gmail"));
//        
//        int j=domain.indexOf(".");
//        String name=domain.substring(0, j);
//        System.out.println(name.equals("gmail"));   
        
    //Find if a number is binary or not
//    
//        int b=10100011;
//        String str=String.valueOf(b);
//        System.out.println(str.matches("[01]+"));
        
    //Find if a number is Hexa-Decimal or not
      
      //here u don't use int bcz here no like fda2552,5512fd so directly use string
//      String str="AF456DB";
//      System.out.println(str.matches("[0-9A-F]+"));
//    
//     //Find is the data in Data format(dd/mm/yyyy)    
//        String d="01/11/2021";
//        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        
    //Remove Special Characters from a string 
       String str="1acD2@5^8#zAK&n4$8%7";
       System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
       System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
       
    //Remove extra spaces from string 
       String str1="    abc    bicky   kumar       jha";
       System.out.println(str1.replaceAll("\\s+", " ").trim());
       
       String str2="bicky   kumar       jha";
       System.out.println(str.replaceAll("\\s+", " "));
    
    //find number of words in a string     
    
       String str3="    abc    bicky   kumar       jha";
       System.out.println(str3.replaceAll("\\s+", " ").trim());
       String words[]=str3.split("\\s");
       System.out.println(words.length);
        
    }
    
}
