import java.util.Scanner;
 class BinarytoDecimal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any binary number : ");
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int i = 0;
		int temp = num;
	while(temp > 0){
		rem = temp%10;
		sum = sum+rem*(int)Math.pow(2,i);
		temp = temp/10;
		i++; 
		}
	System.out.println(sum + " is the decimal form of " + num);
	}
}
