import java.util.*;

abstract class bank{
  abstract void interest(int i);
}

class ICICI extends bank{
  public void interest(int i){
    System.out.println("The interest given by ICICI is 7.3%. Therefore, your amount is "+(i+(i*7.3/100)));
  }
}

class SBI extends bank{
  public void interest(int i){
    System.out.println("The interest given by SBI is 8.4%. Therefore, your amount is "+(i+(i*8.4/100)));
  }
}

class HDFC extends bank{
  public void interest(int i){
    System.out.println("The interest given by HDFC is 9.7%. Therefore, your amount is "+(i+(i*9.7/100)));
  }
}

class prg3{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);

    int amount;
    System.out.println("Enter the amount...");
    amount=sc.nextInt();
    
    bank b1 = new ICICI();
    b1.interest(amount);

    bank b2 = new SBI();
    b2.interest(amount);

    bank b3 = new HDFC();
    b3.interest(amount);
  }
}





class Employee
  {
    int EmployeeID;
    string name;
    string department;
    int salary;
    string designation;
    addBonus();
  }
class Manager
  {
    
  }
class Clerk
  {
    
  }