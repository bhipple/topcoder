import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TeamContestEasy
{
  public int worstRank(int[] strength)
	{
		Arrays.sort(strength, 0, 3);
		int myStr = strength[1] + strength[2];
		
		if(strength.length > 3)
			Arrays.sort(strength, 3, strength.length);
		
		int rank = 1;
		
		int j = 3 + (strength.length - 3 ) / 3;
		int k = strength.length - 1;
		while(j < k) {
			if(strength[j] + strength[k] > myStr) {
				rank++;
				j++;
				k--;
			} 
			else {
				j+=2;
			}
		}
	
		return rank;
	}
	
	<%:testing-code%>
}
//Powered by [KawigiEdit] 2.0!
