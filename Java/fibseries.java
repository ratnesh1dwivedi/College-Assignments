// Q1. Write a Java program to generate Fibonacci series using class and recursive method. 
 
import java.util.*; 
class fibonacci { 
 int n1 =0,n2=1,n3; 
 void fib(int a) { 
 if (a>1){ 
 n3=n1+n2; 
 System.out.println(n3); 
 n1=n2; 
 n2=n3; 
 fib(a-1); 
 } 
 } 
} 
public class fibseries { 
 public static void main(String[] args) { 
 System.out.println("Enter the limit of fibonacci series : "); 
 Scanner sc = new Scanner(System.in); 
 int a = sc.nextInt(); 
 System.out.println("Fibonacci series is : "); 
 System.out.println("0"); 
 System.out.println("1"); 
 fibonacci fb = new fibonacci(); 
 fb.fib(a); 
 } 
} 