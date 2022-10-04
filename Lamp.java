//Create a program with a class name Lamp. It should contains a variable: isOn and two methods: turnOn() and turnOff(). Inside the Main class, create two objects: led and halogen of the Lamp class. Then use the objects to call the methods of the class.//


class lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  boolean isOn;

  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }

  // method to turnoff the light
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}

class Lamp {
  public static void main(String[] args) {

    // create objects led and halogen
    lamp led = new lamp();
    lamp halogen = new lamp();

    // turn on the light by
    // calling method turnOn()
    led.turnOn();

    // turn off the light by
    // calling method turnOff()
    halogen.turnOff();
  }
}