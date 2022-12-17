import java.util.Scanner;
 class maxValInArr{
	public static void main(String args[]){
	System.out.println("Enter the elements of array (10 elements maximum)");
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	for(int i = 0; i < arr.length; i++){
		arr[i] = sc.nextInt();
		}
	for(int i = 0; i< arr.length; i++){
		System.out.print(arr[i] + " ");
		}
	System.out.println();
	System.out.println(" max value in this array is " +  maxVal(arr));
	//System.out.println(ArraystoString(arr));
	}
	static int maxVal(int[] arr){
	int max = arr[0];	
	for(int i = 0; i< arr.length; i++){
		if(arr[i] > max){
			max = arr[i];
			}
		}
		return max;
	}
}
