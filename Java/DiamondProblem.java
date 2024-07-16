// Q17.Write a Program to Show Diamond Problem with Multiple Inheritance. 
 
class A { 
     public void foo() { 
    System.out.println("Class A"); 
    } 
 } 
 class B extends A { 
    public void foo() { 
    System.out.println("Class B"); 
    } 
 } 
 class C extends A { 
    public void foo() { 
    System.out.println("Class C"); 
    } 
 } 
 class D extends B,C { 
    {
        //it show an compilation error
    }
 }
 public class DiamondProblem { 
    public static void main(String[] args) { 
    D d = new D(); 
    d.foo(); 
    } 
 } 
