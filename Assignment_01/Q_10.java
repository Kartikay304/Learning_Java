/* Q10. WAP in Java Program To Survey Four Different Car Models For Four
		Different Cities:
		Your job is to find out the total number of cars sold of each model in all
		the cities. Use Array of objects or multiple objects of class name City
*/

package Assignment_01;
import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		Survey obj = new Survey();
		int[][] arr = new int[4][4];
		obj.read_survey(arr);
		obj.cars_survey(arr);

	}

}

class Survey {
	void read_survey(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[j][i]=sc.nextInt();
				sc.nextLine();
			}
		}
		sc.close();
	}
	
	void cars_survey(int arr[][]) {
		int sum;
		for(int i=0;i<4;i++) {
			sum=0;
			for(int j=0;j<4;j++) {
				sum+=arr[j][i];
			}
			if(i==0) System.out.println("Maruti-k10::"+sum);
			if(i==1) System.out.println("Zen-Astelo::"+sum);
			if(i==2) System.out.println("Wagnor::"+sum);
			if(i==3) System.out.println("Maruti-SX4::"+sum);
		}
	}
}