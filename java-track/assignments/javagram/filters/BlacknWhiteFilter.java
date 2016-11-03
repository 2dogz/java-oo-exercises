package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BlacknWhiteFilter implements Filter {
	
	public Picture process(Picture original) {
		Picture processed = new Picture(original.width(), original.height());	
		 //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  Color c = original.get(i, j);
	    	  
	    	  //get color components from each pixel
	    	  int r = c.getRed();
	    	  int g = c.getGreen();
	    	  int b = c.getBlue();
		
	    	  int newColors = (r + g + b) / 3;
	    	  
	    	  if (newColors < 127.5) {
	    		  newColors = 0;
	    	  }
	    	  else 
	    		  newColors = 255;
	    	  
	    	  processed.set(i, j, new Color(newColors,newColors,newColors));
	}
	    }
	      return processed;
	    }
	    
}
