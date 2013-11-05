import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class FoxAndHandleEasy
{
	public String isPossible(String S, String T)
	{
		for(int i=0; i<S.length(); i++) {
			if(expand(S, i).equals(T))
				return "Yes";
		}
		return "No";
	}
	
	public String expand(String S, int loc) {
		if(loc == 0)
			return S + S;
		if(loc >= S.length())
			return S + S;
		
		StringBuffer str = new StringBuffer();
		for(int i=0; i<loc; i++) {
			str.append(S.charAt(i));
		}
		str.append(S);
		
		for(int i=loc; i<S.length(); i++) {
			str.append(S.charAt(i));
		}
		
		return str.toString();
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
