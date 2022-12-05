import java.util.Scanner;
 class largestNumber{
	public static void main(String args[]){
		System.out.println("LETS CHECK THE LARGEST NUMBER YOU HAVE ENETERED");
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER FIRST NUMBER");
		int a = sc.nextInt();
		System.out.println("PLEASE ENTER SECOND NUMBER");
		int b = sc.nextInt();
		System.out.println("PLEASE ENTER THIRD NUMBER");
		int c = sc.nextInt();
			if(a>b && a>c){
				System.out.println(a + " is the largest number");}
			else if(b>c && b>a){
				System.out.println(b + " is the largest number");}
			else if(c>a && c>b){
				System.out.println(c + " is the largest number");}
			else{
				System.out.println("please enter a number");}
}
}


