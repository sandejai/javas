package maths;

import java.util.Scanner;

public class Fibonacci {
	
	int maxFebo;

	public static void main(String[] args) {
	
		System.out.println("Enter lenght of fibonaci series ");
		Scanner scan = new Scanner(System.in);
		int totalNumberOfFibonacci = scan.nextInt();

		Fibonacci feb = new Fibonacci();
		feb.generateFibonacciSeries(totalNumberOfFibonacci);
	}
	
	public void generateFibonacciSeries(int totalSeriesLenght) {
		int firstNum = 0;
		int secondNum = 1;
		printNextFibonacciNumber(firstNum, secondNum,totalSeriesLenght);
	}

	public void  printNextFibonacciNumber(int fiboOne , int fiboTwo,int totalSeriesLenght) {
		if(totalSeriesLenght >= 1) {
			System.out.print(fiboOne + ",");
			int fiboNext = fiboOne + fiboTwo;			
			totalSeriesLenght --;
			printNextFibonacciNumber(fiboTwo, fiboNext,totalSeriesLenght);
		}
	}
	
	public void fibonacciWithoutRecursion(int totalNumberOfFibonacci) {
		//Without recursion
		int a = 0;
		int b = 1;

		for (int i = 0; i < totalNumberOfFibonacci ; i++) {
			System.out.println(a + ",");
			a = a + b;
			b = a - b;
		}
	}
}
