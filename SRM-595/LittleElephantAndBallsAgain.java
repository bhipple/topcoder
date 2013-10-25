import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class LittleElephantAndBallsAgain
{
	public int getNumber(String S)
	{
		char[] s = S.toCharArray();
		
		char prev = 'z';
		
		int maxStreak = 0;
		int streak = 0;
		
		for(int i=0; i<s.length; i++) {
			char cur = s[i];
			if(cur == prev)
				streak++;
			else {
				maxStreak = Math.max(streak, maxStreak);
				streak = 0;
				prev = cur;
			}
		}
		maxStreak = Math.max(streak, maxStreak);
		
		return s.length - maxStreak - 1;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
