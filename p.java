 class Employee {
 String employeeID;
 String name;
 String department;
 int salary = 200;
 String designation;
 
 String getEmployeeID() {
  return employeeID;
 }
 void setEmployeeID(String employeeID) {
  this.employeeID = employeeID;
 }
 String getName() {
  return name;
 }
 void setName(String name) {
  this.name = name;
 }
 String getDepartment() {
  return department;
 }
 void setDepartment(String department) {
  this.department = department;
 }
 int getSalary() {
  return salary;
 }
 void setSalary(int salary) {
  this.salary = salary;
 }
 String getDesignation() {
  return designation;
 }
 void setDesignation(String designation) {
  this.designation = designation;
 }
 void display()
 {
  System.out.println("Employeee id: "+getEmployeeID());
  System.out.println("Employeee name: "+getName());
  System.out.println("Employeee department: "+getDepartment());
  System.out.println("Employeee salary: "+getSalary());
  System.out.println("Employeee designation: "+getDesignation());

 }
 
}

 class Manager extends Employee{
 int  addBonus(int salary)
 {
    return getSalary() + salary; 
 }
}
 class Clerk extends Employee{
 int addBonus(int salary)
 {
  return getSalary() + salary; 
 }
 }
  class p
    {
      public static void main(String args[])
      {
  Employee employee = new Employee();
  employee.setEmployeeID("E1");
  employee.setName("JOHN");
  employee.setDepartment("IT Department");
  employee.setDesignation("Manager");
  employee.setSalary(500);
  employee.display();
  Manager manager = new Manager();
  System.out.println(manager.addBonus(300));
  Clerk clerk = new Clerk();
  System.out.println(clerk.addBonus(100));
   }
    }

 