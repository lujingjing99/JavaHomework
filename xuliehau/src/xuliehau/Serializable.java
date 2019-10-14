package xuliehau;
public class Serializable{
 private String name;
 
 private double salary;
 public Serializable(String name, double salary) {
  super();
  // TODO Auto-generated constructor stub
  this.name = name;
  this.salary = salary;
 }
 
 public void raiseSalary(double byPercent){
  double temp = salary * byPercent / 100;
  salary += temp;
 }
 public String toString() {
  // TODO Auto-generated method stub
  return getClass().getName() + 
   "[ Name = " + name + ", salary = " + salary +"]";
 }
}