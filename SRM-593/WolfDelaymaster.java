import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class WolfDelaymaster
{
	public String check(String str)
	{
		return prefixValid(str) ? "VALID" : "INVALID";
	}
	
	public boolean prefixValid(String str) {
		if(str.length() == 0)
			return true;
		
		int ct = 0;
		int i = 0;
		while(i < str.length() && str.charAt(i) == 'w') {
			ct++;
			i++;
		}
		
		if(ct == 0)
			return false;
			
		if(!checkRun(str, i, ct, 'o'))
			return false;
		i += ct;
		
		if(!checkRun(str, i, ct, 'l'))
			return false;
		i += ct;
		
		if(!checkRun(str, i, ct, 'f'))
			return false;
		i += ct;
			
		if(i < str.length())
			return prefixValid(str.substring(i, str.length()));	
		
		return true;
	}
	
	boolean checkRun(String str, int idx, int ct, char tar) {
		int hit = 0;
		for(int i=idx; i<str.length() && hit < ct; i++) {
			if(!(str.charAt(i) == tar))
				return false;
			hit++;
		}
		return hit == ct ? true : false;
	}
	
}
//Powered by [KawigiEdit] 2.0!
