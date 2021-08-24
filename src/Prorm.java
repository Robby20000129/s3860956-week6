import java.util.Scanner;
import java.util.*;

public class Prorm {
	public static void main(String[] args) {
		System.out.println("Please enter the number of days:");
		while(true) {
			Scanner input = new Scanner(System.in);
			//Loop input
			int days = input.nextInt();
				if(days <= 0) {
					System.out.println("The input is invalid, Please enter again!");
					System.out.println("Please enter the number of days:");
				}
				else {
					CovidDRecord covid = new CovidDRecord(days);
					System.out.println("Thanks for entering this Covid record.");
				}
			}
		}
}
