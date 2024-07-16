// Q14.Write a program to Input A string from the user and check whether the String is Palindrome or Not? 

import java.util.*; 
public class stringpalindrome{ 
 static void palin(String A){ 
 int sum=0; 
 if (A.length()%2!=0) { 
 for (int i = 1; i < (A.length() - 1) / 2; i++) { 
 if (A.charAt(i) == A.charAt(A.length() - i - 1)) { 
 sum++; 
 } 
 } 
 } 
 else { 
 for (int i = 1; i < A.length() / 2; i++) { 
 if (A.charAt(i) == A.charAt(A.length() - i)) { 
 sum++; 
 } 
 } 
 } 
 if (sum>0){ 
 System.out.println("String is palindrome"); 
 } 
 else { 
 System.out.println("String is not palindrome"); 
 } 
 } 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.println("enter any String : "); 
 String s = sc.nextLine(); 
 palin(s); 
 } 
} 
