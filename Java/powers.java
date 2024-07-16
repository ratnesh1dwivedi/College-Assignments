// Q2. Write a Java Program to calculate m power n using recursive method programming. 
 
import java.util.*; 
public class powers{ 
 public static int pow(int base, int power){ 
 int sum=0; 
 if (power==0){ 
 sum=1; 
 return sum; 
 } 
 else if (power==1){ 
 sum = base; 
 return sum; 
 } 
 else { 
 return base*pow(base,power-1); 
 } 
 } 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter the base : "); 
 int bs = sc.nextInt(); 
 System.out.println("Enter the power for base : "); 
 int pw = sc.nextInt(); 
 System.out.println("The "+pw+" power of "+bs+" base is : "); 
 int sum = pow(bs,pw); 
 System.out.println(sum); 
 } 
} 