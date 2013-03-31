import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class FoxAndGame
{
  public int countStars(String[] result)
	{
		int count = 0;
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length(); j++) {
				if(result[i].charAt(j) == 'o')
					count++;
			}
		}
		return count;
	}
}
