import java.util.Scanner;
import java.util.Arrays;
public class Sum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("Enter 3 numbers:");
	    for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
		int largest = arr[2];
		if(largest>10){
	    int aSplit = largest % 10;
	    int bSplit = largest % 10;
		System.out.println("SUM OF LARGEST NUMBER IS = " +(aSplit + bSplit));
		}
	 
	    System.out.println("SUM OF LARGEST NUMBER IS = " +largest);
		
		}
	
}