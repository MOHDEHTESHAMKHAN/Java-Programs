import java.util.Scanner;
 class printArmstrongs{
	public static void isArms(int i){
		int org = i;
		int cube = 0;
	while(i>0){
		int rem = i%10;
		 cube = cube + rem*rem*rem;
		i = i/10;
		}
	if(org == cube){
		System.out.print(cube + " ");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2; i<=n ; i++){
			isArms(i);
			}
		}
}
