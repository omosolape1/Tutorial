import java.util.Scanner;
 
class absolutevalue
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
    
if(x>0)
System.out.println(x);
else
System.out.println((-1)*(x));


if(y>0)
System.out.println(y);
else
System.out.println((-1)*(y));

if(z>0)
System.out.println(z);
else
System.out.println((-1)*(z));
   }
}