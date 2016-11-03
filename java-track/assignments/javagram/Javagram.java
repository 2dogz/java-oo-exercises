
package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
		
		} while(picture == null);
		Filter filter = null;
		do {
			// TODO - prompt user for filter and validate input
			//asking user for input filter ID
			System.out.println("Enter filter ID:"
					+ "1-Blue "
					+ "2-Black&White "
					+ "3- Flip Horizontally ");
			//set ID to user input
			int ID = in.nextInt();
			
			try {
				// TODO - pass filter ID int to getFilter, and get an instance of Filter back
				filter = getFilter(ID);
			} catch (InputMismatchException e) {
				System.out.println(e);
			}
		} while (filter == null);
		 
		// filter and display image
		
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} 
		else if (fileName.equals(relPath)){
			System.out.println("Are you sure you want to overwrite this image?");
			System.out.println("Enter (y/n)");
			String x = in.next();
			if (x.equalsIgnoreCase("y")){
				String absFileName = dir + File.separator + fileName;
					processed.save(absFileName);
					System.out.println("Image Saved to" + dir + fileName);
			}else {
				System.out.println("Image not saved");
			}
		}
		else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		} 

		// close input scanner
		in.close();
	}


	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int ID) throws InputMismatchException {	
	{
		if(ID == 1){
		return new BlueFilter();
		} 
		else if(ID == 2){
			return new BlacknWhiteFilter();
		} 
		else if(ID == 3){
			return new sidetosideflip();
		} 
		else {
			throw new InputMismatchException("PLEASE ENTER A CORRECT FILTER ID");
		}
		
		}
	}
}