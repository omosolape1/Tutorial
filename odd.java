import java.util.*;

public class odd{

public static void main(String args[]){

int a,b,c;

System.out.print("enter three integers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

System.out.print("Your output");

if (a%2==0)
System.out.println("0");
else
System.out.println("1");

if (b%2==0)
System.out.println("0");
else
System.out.println("1");

if (c%2==0)
System.out.println("0");
else
System.out.println("1");


}
}