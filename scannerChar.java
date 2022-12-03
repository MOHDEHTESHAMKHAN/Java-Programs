import java.util.Scanner;

class scannerChar{
	public static void main(String args[]){
		System.out.println("Enter your name");
		Scanner chars = new Scanner(System.in);
		String name = chars.nextLine();
		System.out.println("THANKS FOR ENTERING YOUR NAME " + name);
}
}
