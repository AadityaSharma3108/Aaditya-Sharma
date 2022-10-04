class pattern
  {
    public static void main(String args[])
    {
      int i=0,j=0,A=1,B=1,Spaces=3;
      for(i=1;i<=4;i++)
        {
        for(j=1;j<=Spaces;j++)
          System.out.print("\t");
          Spaces--;
          for(j=A;j>=B;j=j-1)
            System.out.print(j+ "\t");
            System.out.println();
          A=A+2;
          B=B+1;
        }
    }
  }