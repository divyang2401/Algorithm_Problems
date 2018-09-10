package javaMailAPI;

import java.lang.*;
import java.io.*;
import java.util.*;

public class E22{
//1. alphabatical sorting of list
//2. value of name
	public static int valueAscii(String n) throws NullPointerException{
		    int sumOfString=0;
		    //String n=n.toUpperCase();
		    for(int i=0;i<n.length();i++){
		    	char p=n.charAt(i);
		    	int ps=(int)p-65+1;
		    	sumOfString+=ps;
		    }    
		  return sumOfString;
		}
 
	private static void alphaSort() throws IOException{
		String inputFile= "names2.txt";
		String outputFile="outputs2.txt";
		FileReader fileReader= new FileReader(inputFile);
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		String inputLine ="";
		List<String> lineList= new ArrayList<String>();
		inputLine=bufferedReader.readLine();
		String[] lineLi = inputLine.split(",");
		for(String abc: lineLi) {lineList.add(abc);
		}
		fileReader.close();
		Collections.sort(lineList);
		FileWriter fileWriter =new FileWriter(outputFile);  
		PrintWriter out= new PrintWriter(fileWriter);
		for(String outputLine: lineList){
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();
	 }    

	private static int sumListWise() throws IOException {
		String fileo= "outputs2.txt";
		List<String> op=new ArrayList<>();	
		FileReader f= new FileReader(fileo);
		BufferedReader bf= new BufferedReader(f);
		String inLine;
		int totalValue=0;
		int i=1;
		while(bf.readLine()!=null) {inLine=bf.readLine();
		//inLine= inLine.trim();
		System.out.println(inLine+" " +valueAscii(inLine));
		op.add(inLine);
		}
		for(String ab:op) {
			totalValue= totalValue+(valueAscii(ab)*i);
			i=i+1;
			//System.out.println(i+ " " +"word:  " + ab+ "ascii: "+ valueAscii(ab));
		}
		System.out.println("total sum is: "+totalValue);
		return totalValue;	
	}

	public static void main(String[] args){    
		int p= valueAscii("ZANE");
		System.out.println(p);
	try {
	alphaSort();
	int a=	sumListWise();
	System.out.println("sum is: "+a);
	System.out.println("sucess");
	} catch (IOException e) {
	e.printStackTrace();
	}    

    
	}
}