class Fibanacci
{
public static void main(String args[])
{
int n = 7;
int a =1;
int b = 0;
int temp;

while(n!=0)
{
temp = a+b;
a= b;
b = temp;
System.out.print("\t" +temp);
n--;
}

}
}