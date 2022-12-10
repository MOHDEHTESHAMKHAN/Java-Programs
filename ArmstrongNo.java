import java.util.Scanner;
  class ArmstrongNo{
	public static void main(String args[]){
		System.out.println("ENTER ANY NUMBER");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cube = 0;
		int last = 0;
		int temp = n;
		while(n>0){
			last = n%10;
			cube += last*last*last;
       			n = n/10;
			}
		if(cube == temp){
			System.out.println( cube + " is a Armstrong number.");}
		else{
			System.out.println(temp + " is not a Armstrong numuber");
			
}	
	}
}
