import java.util.Scanner;
 
class AreaOfCircle{
public static void main(String args[])
{
int r;
double area,  pi = 3.14;  
Scanner in = new Scanner(System.in);
System.out.println("Please enter the Radius of the circle");
r = in.nextInt();
area = pi * r * r;
System.out.println("Area of the Circle with Radius = "+ r + " is " + area);
}
}
