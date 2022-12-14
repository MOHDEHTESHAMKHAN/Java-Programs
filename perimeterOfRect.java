import java.util.Scanner;
 class perimeterOfRect{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Rectangular : ");
		int length = sc.nextInt();
		System.out.print("Enter the width of the Rectangular : ");
		int width = sc.nextInt();
		int perimeter = 2*(length + width);
		System.out.print("Perimeter of the Rectangular with lenght : " + length + " and width : " + width + " is " + perimeter);
	}
}
