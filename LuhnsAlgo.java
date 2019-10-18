import java.util.*;
import java.util.Scanner;

public class LuhnsAlgorithm {
    public static boolean Check(String cardnum)
    {
        int sum = 0;
        boolean alternate = false;
        { for(int i = cardnum.length() -1; i>=0; i--)
            {
                int x = Integer.parseInt(cardnum.substring(i, i+1));
                    if(alternate)
                   {
                        x *= 2;
                        if (x>9)
                        {
                            x-=9;
                        }
                       
                    }
            sum +=x;
            alternate = !alternate;
            }
        }
      
        return(sum % 10 == 0);
    
    
    }
    
    

  
    public static void main(String args[] ) throws Exception 
    {
       Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        boolean ans = Check(test);
      if (ans == true)
      {
          System.out.print("VALID");
      }
        else if(ans == false)
        {
            System.out.print("INVALID");
        }
         
   
    
    }
    
}
