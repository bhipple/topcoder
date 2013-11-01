import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class ColorfulRoad
{
	char[] rd;

	public int getMin(String road)
	{
		rd = road.toCharArray();
		
		return moving(rd.length - 1);
	}
	
	public int moving(int start) {
		if(start < 0)
			return -1;
		if(start == 0)
			return 0;
		
		int energy = Integer.MAX_VALUE;
		for(int i=start-1; i>=0; i--) {
			if(isValidNext(start, i)) {
				int thisJump = moving(i);
				if(thisJump > -1) {
					energy = Math.min(energy, thisJump + (start - i) * (start - i));
				}
			}
		}
		
		return energy < Integer.MAX_VALUE ? energy : -1;
	}
	
	public boolean isValidNext(int start, int to) {
		if(rd[start] == 'G' && rd[to] == 'R')
			return true;
		if(rd[start] == 'B' && rd[to] == 'G')
			return true;
		if(rd[start] == 'R' && rd[to] == 'B')
			return true;
		return false;
	}
}
