import java.util.Scanner;
 class celciusToFahrenheit{
	public static void main(String args[]){
		System.out.println("ENTER THE TEMPERATURE IN CELCIUS");
		Scanner sc = new Scanner(System.in);
		int celcius = sc.nextInt();
		int fahrenheit = 0;
		int convert = (celcius*9/5) + 32;
		System.out.println(celcius + " °C");
		System.out.println(celcius + " °C" + " is equals to " + convert + "°F");
}
}
