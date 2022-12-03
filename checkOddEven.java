import java.util.Scanner;
 class checkOddEven{
	public static void main(String args[]){
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			if (n%2 !=0){
				System.out.println("it is an odd number");
			}
			else if(n%2 == 0){
				 System.out.println("it is an even number");
			}

}
}
