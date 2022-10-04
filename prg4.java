import java.util.*;
class Employee{
 void addBonus(int a)
  {
   a=200;
 }
   int EmployeeID;
   string name;
   string department;
   int salary;
   string designation;
}

class Manager extends Employee
  {
    
  }
class Clerk extends Employee
  {
    
  }
Create a class named Employee that can be used to calculate the salaries of different employees. The Employee class should keep a track of the employee ID, name, department, salary, and designation with appropriate accessor and mutator methods. Next, create two additional classes named Manager and Clerk that are derived from Employee. Create an overridden method named addBonus that returns the salary of the employee after adding up the bonus. There is a default bonus of $200/month. Managers have a bonus of $300/month and clerks have a bonus of $100/month. Finally create a display method to print the details of the employee. You may assume the initial salary of an employee and other necessary values. Test your classes from a main method.
