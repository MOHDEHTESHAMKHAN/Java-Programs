import java.util.Scanner;
 class findFactorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find the factorial");
		Double n = sc.nextDouble();
		int fact = 1;
		if(n > 0){
			for(int i=1; i<=n; i++){
				fact = fact*i;
					}
			System.out.println(fact);
				}
			}
		}
