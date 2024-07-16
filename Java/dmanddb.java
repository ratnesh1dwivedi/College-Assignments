/* Q10.Create two classes DM and DB which store the value of distances. DM stores distances in meters and centimeters and DB in feet and inches. Write a program that can read values for the class objects and add one object of DM with another object of DB. Use a member function to carry out the addition operation. The result should be in the format of feet and inches or meters and centimeters depending on the object on display. */
 
import java.util.*; 
class DM { 
 private int meters,centimeters; 
 public DM(int meters, int centimeters) { 
 this.meters = meters; 
 this.centimeters = centimeters; 
 } 
 public DM() { 
 this.meters = 0; 
 this.centimeters = 0; 
 } 
 public void read() { 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter meters: "); 
 this.meters = scanner.nextInt(); 
 System.out.print("Enter centimeters: "); 
 this.centimeters = scanner.nextInt(); 
 } 
 public void display() { 
 System.out.println("Distance: " + this.meters + " meters " + this.centimeters + " centimeters"); 
 } 
 public DM add(DB db) { 
 int totalInCentimeters = this.meters * 100 + this.centimeters; 
 int totalInInches = db.getFeet() * 12 + db.getInches(); 
 int totalInMeters = totalInCentimeters / 100; 
 int totalInCentimetersRemaining = totalInCentimeters % 100; 
 int totalInFeet = totalInInches / 12; 
 int totalInInchesRemaining = totalInInches % 12; 
 int sumInMeters = totalInMeters + totalInFeet; 
 int sumInCentimeters = (int) (totalInCentimetersRemaining + totalInInchesRemaining * 2.54); 
 return new DM(sumInMeters, sumInCentimeters); 
 } 
} 
class DB { 
 private int feet,inches; 
 public DB(int feet, int inches) { 
 this.feet = feet; 
 this.inches = inches; 
 } 
 public DB() { 
 this.feet = 0; 
 this.inches = 0; 
 } 
 public void read() { 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter feet: "); 
 this.feet = scanner.nextInt(); 
 System.out.print("Enter inches: "); 
 this.inches = scanner.nextInt(); 
 } 
 public void display() { 
 System.out.println("Distance: " + this.feet + " feet " + this.inches + " inches"); 
 } 
 public int getFeet() { 
 return this.feet; 
 } 
 public int getInches() { 
 return this.inches; 
 } 
} 
public class dmanddb { 
 public static void main(String[] args) { 
 DM dm = new DM(); 
 DB db = new DB(); 
 dm.read(); 
 db.read(); 
 DM sum = dm.add(db); 
 System.out.println("Sum of distances:"); 
 sum.display(); 
 } 
}