class Base
{
 private int y;
 private int x;
 public void add(long a, int b)
 {
  //long z;
  //z = a+b;
  System.out.print("hii");
 }
 public void add(int a, long b)
 {
   System.out.println("hello");
 }
}

//class Drive extends Base
//{
 
//   public void showDrive()
// 	{
//   	System.out.print("It is a drive class");
// 	}
//   }

class A
{
 public static void main(String args[])
  {
    Base x = new Base(); 
    //int a = 7,b=8;
    //float c=3.8f;
    //x.add(a,b,c);
    x.add(30,20);
  }
}

   