import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class ValueHistogram
{
  public String[] build(int[] values)
	{
		int[] freqs = new int[10];
		Arrays.fill(freqs, 0);
		
		for(int i=0; i<values.length; i++) {
			freqs[values[i]] += 1;
		}
		
		int h = 0;
		for(int i=0; i<freqs.length; i++) {
			if(freqs[i]> h)
				h = freqs[i];
		}
		h++;
		
		String[] res = new String[h];
		
		for(int i=res.length - 1; i >= 0; i--) {
			StringBuffer buff = new StringBuffer();
			for(int j=0; j<freqs.length; j++) {
				if(freqs[j] > 0) {
					buff.append("X");
					freqs[j]--;
				}
				else
					buff.append(".");
			}
			res[i] = buff.toString();
		}	
		return res;
	}
}
//Powered by [KawigiEdit] 2.0!
