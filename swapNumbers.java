import java.util.Scanner;
 class swapNumber{
	public static void main(String args[]){
		System.out.println("ENTER FIRST NUMBER");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("a = " + a);
		System.out.println("ENTER SECOND NUMBER");
		int b = sc.nextInt();
		System.out.println("b = " + b);
		//System.out.println("press ENTER to Swap the numbers");
		int temp;
		Temp(a,b);
}
	public static void Temp(int a , int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping the numbers a = " + a + " and " + "b = " + b);
}
}
