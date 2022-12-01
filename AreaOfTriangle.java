import java.util.Scanner;

class AreaOfTriangle{
	public static void main(String args[]){
	int b, h;
	double area;
	System.out.println("Enter Height of the Triangle");
	Scanner in = new Scanner(System.in);
	h = in.nextInt();
        System.out.println("Height of the Triangle is : " + h);
		
	System.out.println("Enter Breadth of the Triangle");
	b = in.nextInt();
	System.out.println("Breadth of the Triangle is : " + b);
	area = 0.5 * b * h;
	System.out.println("Area of the Triangle with Height : " + h + " and Breadth : " + b + " is " + area);
	System.out.println("THANKYOU FOR USING ME");
	
}
}



