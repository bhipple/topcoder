import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class SkiResortsEasy
{
  public int minCost(int[] altitude)
	{
		int cost = 0;
		int h = altitude[0];
		for(int i=1; i<altitude.length; ++i) {
			if(altitude[i] > h) {
				cost = cost + (altitude[i] - h);
			} else {
				h = altitude[i];
			}
		}
		
		return cost;
	}
}
//Powered by [KawigiEdit] 2.0!
