// Q15.Write a program to check if two arrays contain same elements? 
 
import java.util.*; 
public class sameelements{ 
 static void check(int [] a , int [] b){ 
 int i=0,j=0,c=0,sum=0; 
 for (i=0;i<b.length;i++){ 
 for(j=0;j<a.length;j++){ 
 if (b[i]==a[j]){ 
 break; 
 } 
 } 
 if (j>=b.length){ 
 sum++; 
 } 
 } 
 if (sum>0){ 
 System.out.println("no first and second array contains not same element."); 
 } 
 else { 
 System.out.println("yes first and second array contains same element."); 
 } 
 } 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.println("enter first array size : "); 
 int a = sc.nextInt(); 
 int [] c = new int[a]; 
 System.out.println("enter element : "); 
 for (int i=0;i<a;i++){ 
 c[i]= sc.nextInt(); 
 } 
 System.out.println("enter second array size : "); 
 int b = sc.nextInt(); 
 int [] d = new int[b]; 
 System.out.println("enter element : "); 
 for (int i=0;i<b;i++){ 
 d[i]= sc.nextInt(); 
 } 
 check(c,d); 
 } 
} 
