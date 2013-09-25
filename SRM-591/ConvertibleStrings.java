import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class ConvertibleStrings
{
	String A, B;
	int minCost;
	
	char[] p;
	
	void ratePermutation() {
		int dif = 0;
		for(int i=0; i<A.length(); i++) {
			if(p[(int)(A.charAt(i) - 'A')] != B.charAt(i)) {
				dif++;
			}
		}
		minCost = Math.min(minCost, dif);
	}
	
	void rec(int x) {
		if(x == 9) {
			ratePermutation();
		} else {
			for(int i=x; i<9; i++) {
				// swap p[x] and p[i]
				char o = p[x];
				p[x] = p[i];
				p[i] = o;
				
				rec(x+1);
				
				// restore and continue search
				p[i] = p[x];
				p[x] = o;
			}
		
		}
	}
	
	public int leastRemovals(String A, String B)
	{
		this.A = A; this.B = B;
		minCost = A.length();
		
		p = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		
		rec(0);
		return minCost;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
