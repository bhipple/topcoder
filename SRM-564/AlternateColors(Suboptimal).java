import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class AlternateColors
{
	long redsLeft;
	long greensLeft;
	long bluesLeft;
	
	public String getColor(long r, long g, long b, long k)
	{
		redsLeft = r;
		greensLeft = g;
		bluesLeft = b;
		
		long destroyed = 0;
		
		while(destroyed <= k) {
			destroyed += destroyRed();
			if(destroyed == k)
				return "RED";
				
			destroyed += destroyGreen();
			if(destroyed == k)
				return "GREEN";
				
			destroyed += destroyBlue();
			if(destroyed == k)
				return "BLUE";
		}
		return "";
	}
	
	public long destroyRed() {
		if(redsLeft > 0) {
			redsLeft--;
			return 1;
		}
		return 0;
	}
	
	public long destroyGreen() {
		if(greensLeft > 0) {
			greensLeft--;
			return 1;
		}
	return 0;
	}
	
	public long destroyBlue() {
		if(bluesLeft > 0) {
			bluesLeft--;
			return 1;
		}
		return 0;
	}
	
	<%:testing-code%>
}
//Powered by [KawigiEdit] 2.0!
