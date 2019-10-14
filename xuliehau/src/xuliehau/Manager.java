package xuliehau;

public class Manager extends Employee {
	 
	 private Employee secretary;
	 public Manager(String name, double salary) {
	  super(name, (int) salary);
	  // TODO Auto-generated constructor stub
	  secretary = null;
	 }
	 public Employee getSecretary() {
	  return secretary;
	 }
	 public void setSecretary(Employee secretary) {
	  this.secretary = secretary;
	 }
	 public String toString() {
	  // TODO Auto-generated method stub
	  return super.toString() + "[ secretary = " + secretary +"]";
	 }
	 
	}
