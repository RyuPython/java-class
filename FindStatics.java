import java.io.*;
import java.util.*;

public class FindStatics {
	public static void main(String[] args) throws Exception {
		int numberOfValues;
		String[] words;
		int[] values;
		
		if (args.length != 1) {
			System.out.println(
			"Usage: java FindStatics sourceFile");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(1);
		}
		
		int k = 0;
		try(Scanner input = new Scanner(sourceFile);){
			String s1 = input.nextLine();
			for(int i=0; s1!=(String)i; i++)numberOfValues = i+1;
			words = new int [numberOfValues];
			values = new int [numberOfValues];
			while(input.hasNext()){
				words[k] = input.nextLine();
			}
		}
		
		for(int i=0; i<numberOfValues; i++){
			for(int j=0; words[k]!=(String)j; j++);
			values[i]=j+1;
		}
		
		int sum = 0;
		double avg;
		
		for(int i=0; i<numberOfValues; i++){
			sum = sum + values[i];
		}
		
		avg = sum/numberOfValues;
		
		for(int i=1; i<numberOfValues; i++){
			for(int j=0; j<i; j++){
				if(j<i){
					int temp=j;
					j=i;
					i=temp;
				}
			}
		}
		
		java.io.File outputFile = new java.io.File("Output.txt");
		try(java.io.PrintWriter output = new java.io.PrintWriter(outputFile);){
			output.println("Sum = " + sum);
			output.println("Average = " + avg);
			output.println("Maximum = " + values[0]);
			output.println("Minimum = " + values[numberOfValues]);
			output.println("Sorted");
			output.print(values);
		}
	}
}