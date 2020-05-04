class Employee
{
static String cname = "360Logica";

void display(int eid, String ename)
{
System.out.println("Company Name = " +Employee.cname +"\n");
System.out.println("Roll Number = " +eid);
System.out.println("Name of Student = " +ename);
System.out.print("\n");
}
}

public class Sample2
{
 public static void main(String args[])
  {
   Employee e1 = new Employee();
   System.out.println("\t\t\tCompany Name = " +Employee.cname);
   e1.display(101, "Suraj");
   Employee e2  = new Employee();
   System.out.println("\t\t\tCompany Name = " +Employee.cname);
   e2.display(102, "Novil");
   }
}
