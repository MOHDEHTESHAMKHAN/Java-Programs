import java.util.Scanner;
 class compoundInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount : ");
		Double principal = sc.nextDouble();
		//System.out.print(principal);
		System.out.print("Enter the rate of interest per year : ");
		Double rate = sc.nextDouble();
		//System.out.print(rate);
		System.out.print("Enter the time period in no. of year : ");
		Double time = sc.nextDouble();
		//System.out.print(time);
		Double compAmt = principal * (Math.pow((1+rate/100),time));
		Double compInterest = compAmt - principal;
		System.out.println(compInterest + " is the interest amount on your principal amount " + principal + " for " + time + " year of time." );
		System.out.println(compAmt + " is the total amount to be paid till the end of the time."); 
			}
}
