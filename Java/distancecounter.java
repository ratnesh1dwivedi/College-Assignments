/* Q9. Write a Java program to accept two distance from the user in M: CM: MM format and perform the Addition of Two given Time and Print the Result in M:CM:SS format. */

import java.util.*; 
public class distancecounter{ 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter first distance in Meter , Centimeter , Milimeter form : "); 
 int m1 = sc.nextInt(); 
 int cm1 = sc.nextInt(); 
 int mm1 = sc.nextInt(); 
 System.out.println("Enter second distance in Meter , Centimeter , Milimeter form : "); 
 int m2 = sc.nextInt(); 
 int cm2 = sc.nextInt(); 
 int mm2 = sc.nextInt(); 
 System.out.println("The addition of first and second distance is : "); 
 int mm3=mm1+mm2; 
 int cm3=cm2+cm1; 
 int m3=m1+m2; 
 if (mm3>10){ 
 int temp =mm3%10; 
 cm3+=(mm3-temp)/10; 
 mm3=temp; 
 } 
 if (cm3>100) { 
 int temp1=cm3%100; 
 m3+=(cm3-temp1)/100; 
 cm3=temp1; 
 } 
 System.out.println(m3+"meter :"+cm3+"centimeter :"+mm3+"milimeter"); 
 } 
 } 
