import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class CucumberMarket
{
	public String check(int[] price, int budget, int k)
	{
		Arrays.sort(price);
		int cost = 0;
		
		for(int i=price.length - 1; i> price.length - 1 - k; i--)
			cost += price[i];
		
		return cost > budget ? "NO" : "YES";
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
