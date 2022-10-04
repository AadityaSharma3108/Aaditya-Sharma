import java.util.*;
class lucky
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter a number");
        n=sc.nextInt();
      if(n%9==1)
        System.out.println("Lucky number");
      else
        System.out.println("Not Lucky number");
    }
  }
