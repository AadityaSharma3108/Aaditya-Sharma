import java.util.*;
class friendly
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      double n,x,s;
      System.out.println("Enter 2 numbers");
      n=sc.nextInt();
      x=sc.nextInt();
      s=x;
      for(double i=2;i<=n;i++)
        {
          s=s+ (Math.pow(x,i)/i);
        }
        System.out.println(s);
    }
  }
      