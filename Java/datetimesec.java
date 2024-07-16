/*  Q7. Write a Java program to accept two Time from the user in HH:MM:SS format and perform the Addition of Two given Time and Print the Result in HH:MM:SS format. */
 
import java.util.*; 
public class datetimesec{ 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter first time in hour , minute , second form : "); 
 int h1 = sc.nextInt(); 
 int m1 = sc.nextInt(); 
 int s1 = sc.nextInt(); 
 System.out.println("Enter first time in hour , minute , second form : "); 
 int h2 = sc.nextInt(); 
 int m2 = sc.nextInt(); 
 int s2 = sc.nextInt(); 
 System.out.println("The addition of first and second time is : "); 
 int s3=s1+s2; 
 int h3=h2+h1; 
 int m3=m1+m2; 
 if (s3>60){ 
 int temp =s3%60; 
 m3+=(s3-temp)/60; 
 s3=temp; 
 } 
 if (m3>60) { 
 int temp1=m3%60; 
 h3+=(m3-temp1)/60; 
 m3=temp1; 
 } 
 System.out.println(h3+"hour:"+m3+"minute:"+s3+"second"); 
 } 
} 
