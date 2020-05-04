class A
{
 private int a;
 private String b;
 public void sum(int x, String y)
  {
    
    a = x;
    b = y;
    
  }
 public void display()
  {
    String z = b + a;
    System.out.print("Sum of two number" +z);
  }
}

class B
{
 public static void main(String args[])
  {
    A a = new A();
    a.sum(8, "9");
    a.display();
   }
}
  