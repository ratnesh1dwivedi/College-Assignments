// Q18.Write a java program which shows how to handle the NullPointerException. 
 
import java.util.*; 
public class nullexception{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String str = null; 
        try { 
            int length = str.length(); 
            System.out.println("Length of the string: " + length); 
            } 
            catch (NullPointerException e) { 
                System.out.println("Caught a NullPointerException: " + e.getMessage()); 
                } 
                finally { 
                    System.out.println("Program execution completed."); 
                    } 
    } 
 } 
