import java.util.Scanner;
 class fabonacciSeries{
	public static void fib(int n){
		int f1 = 0;
		int f2 = 1;
		if(n==0){
			System.out.print(f1 + " ");		
				}
		else {
			for(int i=1; i<n; i++){
			System.out.print(f2 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
				}
			}
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fib(n);
			}	
}
