import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheDeviceDiv2
{
  public String identify(String[] plates)
	{
		if(plates.length < 3)
			return "NO";
			
		for(int i=0; i<plates[0].length(); i++) {
			boolean has0 = false;
			boolean has1a = false;
			boolean has1b = false;
			for(int j=0; j<plates.length; j++) {
				if(plates[j].charAt(i) == '0')
					has0 = true;
				if(plates[j].charAt(i) == '1' && has1a)
					has1b = true;
				if(plates[j].charAt(i) == '1' && !has1a) 
					has1a = true;
			}
		
			if(!(has0 && has1a && has1b))
				return "NO";
		}	
		return "YES";
	}
}
