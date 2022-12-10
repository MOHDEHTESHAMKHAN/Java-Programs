import java.util.Scanner;
 class simpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your loan amount: ");
		int loan = sc.nextInt();
		System.out.print("Enter the year period: ");
		int time = sc.nextInt();
		System.out.print("Enter interest rate: ");
		Double rate = sc.nextDouble();
		Double interest = loan*time*rate/100;
		Double finalAmount = loan + interest;
		Double yearInterest = interest/time;
		System.out.println(yearInterest + " is your interest per year");
		System.out.println(interest + " is your total interest on amount " + loan + " for " + time + " year");
		System.out.println(finalAmount + " is the final amount with interest to be paid.");
	}
}
