import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class BallsSeparating
{
  public int minOperations(int[] red, int[] green, int[] blue)
	{
		int n = red.length;
		int res = Integer.MAX_VALUE;
		
		if(n < 3) 
			return -1;
		
		for(int r=0; r<n; r++) {
			for(int g=0; g<n;g++) { 
				if(g != r) 
					for(int b=0; b<n; b++) {
						if(b != r && b!= g) {
							int moves = 0;
							for(int i=0; i<n; i++) {
								int cr = green[i] + blue[i];
								int cg = red[i] + blue[i];
								int cb = red[i] + green[i];
								if(i == r) 
									moves += cr;
								else if(i == g)
									moves += cg;
								else if(i == b)
									moves += cb;
								else
									moves += Math.min(cr, Math.min(cb, cg));							
							}
							
							res = Math.min(res, moves);
						}
					}
			}
		}
		
		return res;
	}
}
//Powered by [KawigiEdit] 2.0!
