import java.util.Scanner;
class checkLastDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any large number");
		int n = sc.nextInt();
		int last = n%10;
		System.out.println("last digit of the number you have entered is " + last);
		
}
}
