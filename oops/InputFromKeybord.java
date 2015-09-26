package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromKeybord {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//option-1
		boolean keepTaking = true;
		Scanner scanner = new Scanner(System.in);	
		
		while(scanner.hasNextLine()){
			String input = scanner.nextLine();
			
			if(!input.equalsIgnoreCase("EXIT")){
				System.out.print(input);
			}
			else{
				break;
			}
		}
		
		//OPtion-2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("IO" + br.readLine());
	}

}
