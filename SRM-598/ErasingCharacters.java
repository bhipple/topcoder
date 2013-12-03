import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class ErasingCharacters
{
	public String simulate(String s)
	{
		boolean change = true;
		while(change) {
			change = false;
			for(int i=0; i<s.length() - 1; i++) {
				if(s.charAt(i) == s.charAt(i+1)) {
					s = s.substring(0, i) + s.substring(i+2);
					change = true;
				}
			}
		}
		
		return s;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
