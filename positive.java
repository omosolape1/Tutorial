import java.util.Scanner;
 
class positive
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
System.out.println("Your output");
    
if(x % 2==0)
System.out.println("true");
else
System.out.println("false");


if(y % 2==0)
System.out.println("true");
else
System.out.println("false");

if(z % 2==0)
System.out.println("true");
else
System.out.println("false");
   }
}