package bly;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProcessTblFile {
	public ProcessTblFile(Scanner in) {  
		String line = "";
		while(in.hasNextLine()){
			line = in.nextLine();
			StringBuilder newLine = new StringBuilder(line);
			int len = newLine.length();
			if(newLine.charAt(len-1)=='|'){
				newLine.deleteCharAt(len-1);
        
			}
			System.out.println(newLine.toString()); 	
		}
	}  


	public static void main(String[] args) throws Exception{  
       
        	List<String> fileName = new ArrayList<>(Arrays.asList("customer.tbl","lineitem.tbl","nation.tbl","orders.tbl","part.tbl","partsupp.tbl","region.tbl","supplier.tbl"));
        	String inputFilenamePrefix = "/Users/biliyuan/Documents/workspace/Postgre/files/";  
        	String outputFilenamePrefix = "/Users/biliyuan/Documents/workspace/Postgre/files/output/"; 
        
        	for(int i=0;i<fileName.size();i++){	
            		System.setIn(new FileInputStream(inputFilenamePrefix + fileName.get(i)));  
            		System.setOut(new PrintStream(new FileOutputStream(outputFilenamePrefix + fileName.get(i))));  
            		Scanner in = new Scanner(System.in);  
            		ProcessTblFile ex = new ProcessTblFile(in);  
            		in.close();
        	} 
    	}  
}
