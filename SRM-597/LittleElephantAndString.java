import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class LittleElephantAndString
{	
	public int getNumber(String A, String B)
	{
		char[] Ac = A.toCharArray();
		char[] Bc = B.toCharArray();
		// Possibility check
		Arrays.sort(Ac);
		Arrays.sort(Bc);
		String checkA = new String(Ac);
		String checkB = new String(Bc);
		if(!checkA.equals(checkB))
			return -1;
			
		int unmoved = 0;
		int i = A.length() - 1;
		int j = B.length() - 1;
		while(i >= 0 && j >= 0) {
			if(A.charAt(i) == B.charAt(j)) {
				i--;
				j--;
				unmoved++;
			}
			else {
				i--;
			}
		}
		
		return A.length() - unmoved;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
