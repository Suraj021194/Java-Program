abstract class Shape
{
 abstract void show();
}

class Rectangle extends Shape
{
   
   void show()
   {
     int a = 8;
     int b = 9;
     int z = a * b;
     System.out.print("The area of reactangle" +z);
   }
}

class TestShape
{
 public static void main(String args[])
  {
    Shape s1 = new Rectangle();
    s1.show();
  }
}
