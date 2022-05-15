class Box { 
  double width;
  double height;
  double depth;
  double volume() 
  {
    return width * height * depth;
    } 
}
class BoxColour extends Box 
{
  String colour;
  BoxColour(double w, double h, double d, String c) 
  {
    width = w;
    height = h;
    depth = d;
    colour = c;
  }
} 
class prg1
{ 
  public static void main(String args[])
  {
    BoxColour mybox1 = new BoxColour(10, 20, 30, "red");
    BoxColour mybox2 = new BoxColour(70, 40, 44, "blue");
    double vol;
    vol = mybox1.volume();
    System.out.println("Volume of mybox1 is " + vol); 
    System.out.println("Colour of mybox1 is " + mybox1.colour); 
    vol = mybox2.volume();
    System.out.println("Volume of mybox2 is " + vol); 
    System.out.println("Colour of mybox2 is " + mybox2.colour); 
    }
}