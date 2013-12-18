import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class MiniatureDachshund
{
	public int maxMikan(int[] mikan, int weight)
	{
		Arrays.sort(mikan);
		int ate = 0;
		while(weight <= 5000 && ate < mikan.length) {
			weight += mikan[ate];
			if(weight <= 5000)
				ate++;
		}
		return ate;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
