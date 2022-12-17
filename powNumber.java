import java.util.Scanner;
 class powNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base numebr : ");
		int num = sc.nextInt();
		System.out.print("Enter the power for " + num + " : ");
		int pow = sc.nextInt();
		
		int temp = num;
			if(pow == 1){
				System.out.println(num + " is the solution.");			}
			for(int i = 2; i <= pow; i++){
				temp =temp* num;
			}
		System.out.println(temp + " is the Solution.");
		
	}
}
