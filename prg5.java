 class Employee {
 String employeeID;
 String name;
 String department;
 int salary = 200;
 String designation;
  String getEmployeeID() {
  return employeeID;
 }
  void setEmployeeID(String employeID) {
  this.employeeID = employeID;
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
  System.out.println("Employee id: "+getEmployeeID());
  System.out.println("Employee name: "+getName());
  System.out.println("Employee department: "+getDepartment());
  System.out.println("Employee salary: "+getSalary());
  System.out.println("Employee designation: "+getDesignation());

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
 class prg5 {
 public static void main(String args[]) {
  Employee employee = new Employee();
  employee.setEmployeeID("E101");
  employee.setName("AADITYA");
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

666..>>>