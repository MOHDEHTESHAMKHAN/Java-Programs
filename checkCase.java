import java.util.Scanner;
class checkCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
 		char alpha = sc.next().charAt(0);
		if(alpha >= 'a' && alpha <= 'z' ){
			System.out.println("this is an lower case letter");
}
		else if(alpha >= 'A' && alpha <= 'Z'){
			System.out.println("THIS IS AN UPPER CASE LETTER");
}
		else {
			System.out.println("this is not character");

}
}
}
