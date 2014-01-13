import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class WinterAndMandarins
{
	public int getNumber(int[] bags, int K)
	{
		Arrays.sort(bags);
		int min = bags[bags.length - 1] - bags[0];
		
		for(int i=0; (i+K-1)<bags.length; i++) {
			min = Math.min(min, bags[i+K-1] - bags[i]);
		}
		return min;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
