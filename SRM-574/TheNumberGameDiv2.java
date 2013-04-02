import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheNumberGameDiv2
{
	public int minimumMoves(int A, int B)
	{
		Integer t1 = new Integer(A);
		Integer t2 = new Integer(B);
		String x = t1.toString();
		String y = t2.toString();
		
		StringBuffer buff = new StringBuffer();
		for(int i=0; i<y.length(); i++) {
			buff.append(y.charAt(y.length() - i - 1));
		}
		
		String yR = buff.toString();
		
		if(x.contains(y)) {
			boolean needsReversed = false;
			for(int i=0; i<y.length(); i++) {
				if(x.charAt(i) != y.charAt(i)) {
					needsReversed = true;
				}
			}
			
			if(needsReversed) {
				if(x.contains(yR))
					return x.length() - y.length() + 1;
				else 
					return x.length() - y.length() + 2;
			}
			else
				return x.length() - y.length();
		}
		else if(x.contains(yR)) {
			return x.length() - y.length() + 1;
		} else 
			return -1;	
	
	}
}
