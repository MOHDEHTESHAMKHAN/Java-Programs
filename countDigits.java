import java.util.Scanner;
 class countDigits{
	public static void main(String args[]){
		System.out.println("ENTER THE NUMBER TO KNOW THE LENGTH OF THE NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int lastdigit = 0;
		while(n>0){
			lastdigit = n%10;
			count++;
			n = n/10;
}
		System.out.println("Length of the number that you have entered is : " + count);
}
}
