import java.util.*;
class linear
  {
    public static void main(String args[])
    {
      int a[] = new int[5];
      int val ,flag = 0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter list of 5 elements");
     
      for(int i=0; i<5; i++)
        {
          a[i] =sc.nextInt();
         System.out.println("Enter value to be searched");
          val = sc.nextInt();
          for ( i=0; i<5; i++)
            {
              if(val==a[i])
              {
               System.out.println("Value found at " + i);
                flag=1;
                break;
              }
            }
          if(flag == 0)
          System.out.println("Value not found ");
        }

    }
  }
