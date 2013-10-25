import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class LittleElephantAndIntervalsDiv2
{
	public int getNumber(int M, int[] L, int[] R)
	{
		int options = 1;
		
		for(int i=0; i<L.length; i++) {
			boolean[] activeChoices = new boolean[M + 1];
			
			// Initialize
			for(int j=L[i]; j<=R[i]; j++) {
				activeChoices[j] = true;
			}
			
			// Check to see if completely overlapped by remaining actions
			for(int step = i+1; step < L.length; step++) {
				for(int b = L[step]; b <= R[step]; b++) {
					activeChoices[b] = false;
				}
			}
			
			if(meaningful(activeChoices))
				options *= 2;
		}
		
		return options;
	}
	
	public boolean meaningful(boolean[] choices) {
		for(int i=0; i<choices.length; i++)
			if(choices[i])
				return true;
		return false;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
