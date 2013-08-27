import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class TeamsSelection
{
	public String simulate(int[] preference1, int[] preference2)
	{
		int n = preference1.length;
		String res = "";
		int[][] prefs = {preference1, preference2};
		
		char[] teams = new char[n];
		Arrays.fill(teams, '?');
		
		for(int i=0; i<n; i++) { 
			int j = 0;
			while(teams[prefs[i%2][j] - 1] != '?') {
				j++;
			}
			char assign;
			if(i%2 == 0)
				assign = '1';
			else
				assign = '2';
			teams[prefs[i%2][j] - 1] = assign;
		}	
		
		for(int i=0; i<n; i++) {
			res += teams[i];
		}
		
		return res;
	}
	
<%:testing-code%>
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
