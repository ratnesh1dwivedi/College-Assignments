// Q11.Write a Java program to Genrate 10 random numbers in java? 
 
import java.util.*; 
public class random{ 
 public static void main(String[] args) { 
 System.out.println("ten random number in java under 100 : "); 
 Random r = new Random(); 
 int [] rand = new int[10]; 
 for (int i=0;i<10;i++){ 
 rand[i]=r.nextInt(100); 
 System.out.println(rand[i]); 
 }
 }
}