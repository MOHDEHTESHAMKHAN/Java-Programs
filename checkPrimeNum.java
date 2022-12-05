import java.util.Scanner;
 class checkPrimeNum{
	public static void main(String args[]){
		System.out.println("lets check weather the number is Prime or not!");
		System.out.println("Please enter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j= 0;
		for (int i=2; i<n ; i++){
			 if(n%i == 0){
				j++;
				break;	}}
			if (j == 0){
				System.out.println(n + " is a prime number");
					}
			else if(j !=0){
				System.out.println(j);
				System.out.println(n + " is not a prime number");
					}
			else{
				System.out.println("please enter a number");
				}	}			
		}
	
