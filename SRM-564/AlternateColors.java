import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class AlternateColors
{
	public String getColor(long r, long g, long b, long k)
	{
		long[] c = new long[] {r, g, b};
		String[] name = new String[] {"RED", "GREEN", "BLUE"};
		int t = 3;	// Number of types
		while(t > 1) {
			long m = c[0];
			for(int i=1; i<t; i++) {
				m = Math.min(m, c[i]);
			}
			if(k <= m * t) 
				return name[(int) ( (k-1) % t ) ];
			
			k -= t * m;
			
			int oldt = t;
			t = 0;
			for(int i=0; i<oldt; i++) {
				if( c[i] - m > 0 ) {
					c[t] = c[i] - m;
					name[t++] = name[i];
				}
			}
		}
		
		return name[0];
	}
	
	<%:testing-code%>
}
//Powered by [KawigiEdit] 2.0!
