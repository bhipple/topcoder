import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class JumpFurther
{
	public int furthest(int N, int badStep)
	{
		boolean hitBad = false;
		int onStep = 0;
		for(int i=1; i<=N; i++) {
			onStep = onStep + i;
			if(onStep == badStep) {
				hitBad = true;
				break;
			}	
		}
		int sum = N * (N + 1) / 2;
		
		return hitBad ? (sum - 1) : sum;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
