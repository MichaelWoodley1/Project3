package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloSample {

	public static void main(String[] args) {
		// check if users put in any path to the .lgoo file
		if(args.length != 0) {
			String path = args[0];
			try {
	        	// Instantiate a Buffered Reader Object
	            @SuppressWarnings("resource")
				BufferedReader input = new BufferedReader(new FileReader(path));
	            // Read the first line of the file and assigns it to the variable line
	            String line = input.readLine();
	            // Start the while loop, the loop stops when line is equal to null
	            while(line != null) {
	            	// print out the line
	            	// TODO: might need to do work here
	            	System.out.println(line);
	            	// Read the next line and assigns it to variable line.
	            	line = input.readLine();
	            }
	        }
	        catch(FileNotFoundException fnfe)
	        {
	            System.out.println("File Not Found");
	        }
	        catch(IOException ioe)
	        {
	            System.out.println("Problem reading from file");
	        }
		} 
	}

}
