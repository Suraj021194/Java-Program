import java.util.*;
class Days
{
public static void main(String agrs[])
{
Scanner s1 = new Scanner(System.in);
System.out.print("Select a day from (1-7): ");
int a = s1.nextInt();
System.out.println("Today day is");
switch(a)
{
case 1:
System.out.println("Sunday");
break;

case 2:
System.out.println("Monday");
break;

case 3:
System.out.println("Tuesday");
break;

case 4:
System.out.println("Wednesday");
break;

case 5:
System.out.println("Thursday");
break;

case 6:
System.out.println("Friday");
break;

case 7:
System.out.println("Saturday");
break;

default:
System.out.print("Sorry, you choose invalid options");
}

}
}

