import java.util.Scanner;
 class displayPrime{
  static boolean isPrime(int n) {
                for (int i = 2; i < n; i += 1) {
                        if (n % i == 0) return false;
                }
                return true;
        }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
		boolean ans = isPrime(i);
		System.out.print( ans + " ");
		System.out.println(i);	
	}
	}
}
