import java.util.Scanner;
import java.util.*;

public class CovidDRecord {
	private int numDays;
	private int []numCases;
	
	public CovidDRecord(int days){
		this.numDays = days;
		this.numCases = new int[days];
		recordCases();
		printCases();
		System.out.println("Max Cases: "+findMax());
		System.out.println("Min Cases: "+findMin());
	}
	public void recordCases() {
		System.out.println("Please enter the number of cases on each day:");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < numCases.length; i++) {
			numCases[i] = input.nextInt();
			//loop input number to array
			if(numCases[i] <=0) {
				System.out.println("The input is invalid. Please enter the number of cases on Day1 again!");
				i--;
				//if input is invalid, run this constractor again
			}
		}
	}
	public void printCases() {
		for(int i = 0; i < numCases.length; i++) {
			if(i != numCases.length -1) {
				System.out.print(numCases[i] +",");
		}
		else {
			System.out.println(numCases[i] +"");
			//last one have no "," and last one have line break
			}
		}
	}
	
	public int findMax() {
		int Max;
		Max =0;
		//define Max is a small number
		for(int i = 0; i < numCases.length; i++) {
			if(numCases[i]>Max) {
				Max = numCases[i];
			}
		}
		return Max;
	
	}
	public int findMin() {
		int Min;
		Min =10000;
		//define Min is a large number
		for(int i = 0; i < numCases.length; i++) {
			if(numCases[i]<Min) {
				Min = numCases[i];
			}
		}
		return Min;
	}
}
