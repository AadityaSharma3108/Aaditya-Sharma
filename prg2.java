
class figure{
  double n1,n2;

  figure(double a,double b){
    n1=a;
    n2=b;
  }

  void area(){
  }
}

class rectangle extends figure{
  double n3;
  rectangle(double c,double n1,double n2){
    super (n1,n2);
    n3=c;
    System.out.println("The area of rectangle is ")
 . }
  class triangle extends A{
  double n3;
  triangle(double c,double n1,double n2){
    super (n1,n2);
    n3=c;
  }

class prg2{
  public static void main(String x[]){
    A ob1 = new A(2.0,3.0);
    rectangle ob = new rectangle(4.0,2.0,3.0);
    ob.cal();
  }
}