import java.util.Scanner;

class scannerBoolean{
	public static void main(String args[]){
		System.out.println("THIS WEBSITE CONTAINS SOME ADULTS. ARE YOU OVER 18+");
		System.out.println("Enter TRUE / FALSE only");
		Scanner sc = new Scanner(System.in);
		boolean age = sc.nextBoolean();
		System.out.println("YOUR INPUT IS : " + age);
}
}
