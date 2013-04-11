import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class MonstersValley2
{
  public int minimumPrice(int[] dread, int[] price)
	{
		if(dread.length == 1)
			return price[0];
		
		long party = (long) dread[0];
		int res = price[0];
	
	
		return continuePath(dread, price, 1, party, res);
	}
	
	public int continuePath(int[] dread, int[] price, int loc, long party, int res) {
		// base case
		if(loc >= dread.length) {
			return res;
		}
		
		// have to bribe
		else if((long) (dread[loc]) > party) {
			return continuePath(dread, price, loc + 1, party + (long) dread[loc], res + price[loc]);
		} else {
			int c1 = continuePath(dread, price, loc + 1, party + (long) dread[loc], res + price[loc]);
			int c2 = continuePath(dread, price, loc + 1, party, res);
			
			return Math.min(c1, c2);
		}
	}
	
}
//Powered by [KawigiEdit] 2.0!
