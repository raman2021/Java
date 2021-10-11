import java.util.Scanner;

   public class Lab3 {
	   
   public static void main (String args[]) {
	   
	   
	   System.out.println("Write plain text: ");
	   Scanner scan = new Scanner(System.in);
	   String stringText = scan.next();
	   System.out.println("Enter a numeric value to shift plain text: ");
	   int shiftingNum = scan.nextInt();
	   String cText = "" ;
	   char alphabetic;
	   
	  for(int i=0; i < stringText.length();i++) 
        {
         
            alphabetic = stringText.charAt(i);
            
            
            if(alphabetic >= 'a' && alphabetic <= 'z') 
            {
             
             alphabetic = (char) (alphabetic + shiftingNum);
             
             if(alphabetic > 'z') {
                
                alphabetic = (char) (alphabetic+'a'-'z'-1);
             }
             cText = cText + alphabetic;
			  }
            
            
            else if(alphabetic >= 'A' && alphabetic <= 'Z') {
             
             alphabetic = (char) (alphabetic + shiftingNum);    
                
             
             if(alphabetic > 'Z') {
                 
                 alphabetic = (char) (alphabetic+'A'-'Z'-1);
             }
             cText = cText + alphabetic;
            }
            else {			
             cText = cText + alphabetic;   
            }
        
    }
    System.out.println(" ciphertext : " + cText);
  }
}