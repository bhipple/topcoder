import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class WinterAndCandies
{
	public int getNumber(int[] type)
	{
		int[] cnt = new int[51];
		for(int i=0; i<type.length; i++) {
			cnt[type[i]]++;
		}
		
		int res = 0;
		int p = 1;
		for(int k = 1; k<=type.length; k++) {
			p *= cnt[k];
			res += p;
		}
		
		return res;
	}
	

}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
