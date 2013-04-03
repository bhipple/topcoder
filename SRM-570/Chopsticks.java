import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class Chopsticks
{
  public int getmax(int[] length)
	{
		int count = 0;
		Integer n;
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int i=0; i<length.length; i++) {
			n = length[i];		
			boolean match = hash.add(n);
			
			if(!match) {
				count++;
				hash.remove(n);
			}
		}
		
		return count;
	}
	
}
//Powered by [KawigiEdit] 2.0!
