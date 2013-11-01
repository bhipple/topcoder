import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class FoxAndSightseeing
{
	int[] pos;
	
	public int getMin(int[] position)
	{
		this.pos = position;
		int res = Integer.MAX_VALUE;
		
		// Skip the ith city
		for(int i=1; i<position.length - 1; i++) {
			int thisRes = 0;
			for(int k=0; k<position.length; k++) {
				if(k != i) {
					if(k+1 == i)
						thisRes += cost(k, k+2);
					else
						thisRes += cost(k, k+1);
				}
			}
			res = Math.min(res, thisRes);
		}
		
		return res;
	}
	
	public int cost(int i, int j) {
		if(j >= pos.length)
			return 0;
		return Math.abs(pos[i] - pos[j]);
	}
}
