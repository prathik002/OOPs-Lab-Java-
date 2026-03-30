import Graphics.*;
import java.util.Scanner;

public class Test_Graphics {
    public static void main(String args[]) {
         Scanner sc = new
         Scanner(System.in);
         
         System.out.println("\nEnter side of Square: ");
         int s = sc.nextInt();
         Square sq = new Square(s);
         System.out.println("Perimeter: " + sq.perimeter());
         System.out.println("Area: " + sq.area());
         
         System.out.println("\nEnter radius of Circle: ");
         double r = sc.nextDouble();
         Circle ci = new Circle(r);
         System.out.println("Perimeter: " + ci.perimeter());
         System.out.println("Area: " + ci.area());
         
         System.out.println("\nEnter three sides of Triangle: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         Triangle tr = new Triangle(a,b,c);
         System.out.println("Perimeter: " + tr.perimeter());
         System.out.println("Area: " + tr.area());
         
         System.out.println("\nEnter Length & Breadth of Rectangle: ");
         int d = sc.nextInt();
         int e = sc.nextInt();
         Rectangle rect = new Rectangle(d,e);
         System.out.println("Perimeter: " + rect.perimeter());
         System.out.println("Area: " + rect.area());
         }
}
