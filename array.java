import java.util.*;
public class array
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int Arr[];
      int i=0;
      Arr[i]=sc.nextInt();
      len=Arr.length;
      sum=0;
      for(i=0;i<len;i++)
        {
          if (Arr[i]>=10&&Arr[i]<=99)   
            sum=sum+Arr[i];
            }
      System.out.println("Sum of all 2 digit elements: " + sum);
     }
    }
  