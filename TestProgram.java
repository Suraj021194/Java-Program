interface Employee
{
 void displayData();
}

interface Programmer extends Employee
{
 void showData();
 
}

class Programming implements Programmer
{
  public void displayData()
  {
   System.out.print("Every Programmer Display programming");
  }
 public void showData()
 {
  System.out.print("Every programmer Showing programming");
 }
 
}

class TestProgram
{
 public static void main(String args[])
 {
   Programmer a1 = new Programming();
   a1.displayData();
   a1.showData();
  }
}

  