class A {
  int i;
    int j;
    int k;

    void showjk() {
      System.out.println("j: " + j + "k: " + k);
    }
  void show() {
    System.out.println("i: " + i);
  }

  class B extends A {
void multiply()
      {
    System.out.println("i*j*k = " + (i * j * k));
        }
    void add()
      {
    System.out.println("i+j+k = " + (i + j + k));
        }
   void subtract()
      {
        System.out.println("i-j-k = " + (i - j - k));
        }
    void divide()
      {
    System.out.println("i/j/k = " + (i / j / k));
        }
  }
}

class prg {
  public static void main(String args[]) {
    A superOb = new A();
    superOb.i = 2;
    superOb.j = 5;
    super.k = 10;
    
    B subOb = new B();
