import java.util.Scanner;
 class sumOfNNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter the number to take sum of natural numbers till that number");
		n = sc.nextInt();
  		for(int i=1; i<=n; i++){
		sum = sum+i;
}
		System.out.println(sum);	
			
}
}
