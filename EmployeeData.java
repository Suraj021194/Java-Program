class Person
{
  int a = 8;
    void show()
      {
        System.out.print("The value of a before changing" + a);
        a = 100;
        System.out.print("The value of a after changing" + a);
      }
}

class EmployeeData extends Person{
 void show()
 {
  a =100;
  System.out.print("the value of a" +a);
 }
 public static void main(String args[])
  {
   Person e1 = new EmployeeData();
   e1.show();
  }
}

   
   
 