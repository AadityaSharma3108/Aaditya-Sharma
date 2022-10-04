import java.util.*;
class bubble
  {
    public static void main(String args[])
    {
      int t;
      Scanner sc = new Scanner(System.in);
      int a[] = new int[10];
      System.out.println("Enter 10 elements");
      for(int i=0; i<10; i++)
        {
          a[i] = sc.nextInt();
          for(int j=0; j<9; j++)
            {
              if(a[j] > a[j+1]);
              {
                t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
              }
            }
        }
      System.out.println("Sorted list");
      for(int i=0; i<10; i++)
        {
          System.out.println(a[i] + " , ");
        }
    }
  }