import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class LittleElephantAndBooks
{
	public int getNumber(int[] pages, int number)
	{		
		Arrays.sort(pages);
		int n = 0;
		
		for(int i=0; i<number; i++) 
			n += pages[i];
		
		return n - pages[number-1] + pages[number];
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
