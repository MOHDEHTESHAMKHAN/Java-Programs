import java.util.Scanner;
 class pelindromeNO{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is pelindrome or not : ");
		int num = sc.nextInt();
		int rem;
		int rev = 0;
		int temp = num;
	 while(temp != 0){
                rem = temp%10;
                rev = rev*10 + rem;
                temp = temp/10;
                        }
                

		if(rev == num){
			System.out.println(num + " is pelindorme");	
			}
		else{
			System.out.println(num + " is not pelindorme");
			}		
	}
}

