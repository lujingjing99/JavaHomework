package xuliehau;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Test {
 
 public static void main(String[] args){
  
  Employee employee = new Employee("LiLei", 1000);
  Manager manager1 = new Manager("Jim", 20000);
  manager1.setSecretary(employee);
  
  Employee[] staff = new Employee[2];
  staff[0] = employee;
  staff[1] = manager1;
  
  try{
   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));
   oos.writeObject(staff);
   oos.close();
   
   ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));
   Employee[] newStaff = (Employee[])ois.readObject();
   ois.close();
   
   newStaff[0].raiseSalary(1000);
   
   for(int i=0; i<newStaff.length; i++)
    System.out.println(newStaff[i]);
   
  }catch(Exception e)
  {
   e.printStackTrace();
  }
 }
}
