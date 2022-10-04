import java.util.*;
class prg7
  {
    public static void main(String[] args)
    {
      int a[] = new int[5];
      int s=0,c=0;
      System.out.println("Enter 5 elements");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          a[i] = sc.nextInt();
          if(a[i]%2!=0)
          {
            s=s+a[i];
            c++;
          }
        }
      System.out.println("Sum=" +s);
      System.out.println("Average =" +s/c);
      
          }
        }