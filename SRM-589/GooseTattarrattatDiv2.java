import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class GooseTattarrattatDiv2
{
	public int getmin(String S)
	{
		char[] str = S.toCharArray();
		Arrays.sort(str);
		
		int maxFreq = 1;
		int thisFreq = 1;
		char toKeep = str[0];
		char last = str[0];
		for(int i=1; i<str.length; i++) {
			if(str[i] == last)
				thisFreq++;
			else {
				if(thisFreq > maxFreq) {
					maxFreq = thisFreq;
					toKeep = str[i-1];
				}
				thisFreq = 1;
			}
			
			last = str[i];
		}
		
		if(thisFreq > maxFreq) {
			maxFreq = thisFreq;
			toKeep = str[str.length - 1];		
		}
		
		int rep = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i] != toKeep) 
				rep++;
		}
		return rep;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
