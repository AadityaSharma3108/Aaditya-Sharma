class figure{
  double n1,n2;
  figure(double a,double b)
  {
    n1=a;
    n2=b;
  }
  double area()
  {
    System.out.println("Area is undefined");
    return 0;
  }
}

class rectangle extends figure{
  rectangle(double n1,double n2){
    super (n1,n2);
  }
  double area()
  {
    System.out.println("Area of rectangle is ");
    return n1*n2;
    }
  }
  class triangle extends figure{
  triangle(double n1,double n2){
    super (n1,n2);
  }
    double area()
    {
      System.out.println("Area of triangle is ");
      return 0.5*n1*n2;
    }
  }

class DMD{
  public static void main(String x[]){
    figure ob1 = new figure(10,10);
    rectangle ob2 = new rectangle(9,5);
    triangle ob3 = new triangle(5,8);
    figure figref;
    figref=ob1;
    figref.area();
    figref=ob2;
    figref.area();
    figref=ob3;
    figref.area();
    }
}