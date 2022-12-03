import java.util.Scanner;
 
class scannerDouble{
	public static void main(String args[]){
		System.out.println("Enter the price of BITCOIN");
		Scanner bitcoin = new Scanner(System.in);
		Double bitC = bitcoin.nextDouble();
		System.out.println("Current Rate of bitcoin is $ " + bitC);
}
}
