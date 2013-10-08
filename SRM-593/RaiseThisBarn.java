import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class RaiseThisBarn
{
	public int calc(String str)
	{
		int res = 0;
		int cows = 0;
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i) == 'c') 
				cows++;
		
		if(cows % 2 != 0)
			return 0;

		int cowsPassed = 0;
		for(int i=0; i<str.length() - 1; i++) {
			if(str.charAt(i) == 'c')
				cowsPassed++;
			if(cowsPassed == cows/2)
				res++;
		}
		return res;
	}
}
