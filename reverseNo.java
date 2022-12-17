import java.util.Scanner;
 class reverseNo{
	public static void main(String args[]){
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		int rev  = 0;
		int rem;
		int temp = num;
		while(temp != 0 ){
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;		
		}
		System.out.println(rev + " is the rev of " + num);
		
	}
}
