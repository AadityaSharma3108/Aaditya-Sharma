import java.util.*;
class abcd
  {
    public double area(double l, double b)
    {
      double a = l*b;
      return a;
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length and breadth");
      double l = sc.nextDouble();
      double b = sc.nextDouble();
      abcd obj = new abcd();
      double ar = obj.area(l,b);
      System.out.println(" The area of the rectangle is " + ar);
    }
  }