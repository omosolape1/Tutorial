import java.util.Scanner;
 
class maximum
{
   public static void main(String args[])
   {
      int x, y, z,a,b,c;
      System.out.println("Enter six  integers ");
      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
if (a>b)
System.out.println(a);
else
System.out.println(b);


    
if (c>x)
System.out.println(c);
else
System.out.println(x);

if (y>z)
System.out.println(y);
else
System.out.println(z);
   }
}