import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class TheSquareRootDilemma
{
	public int countPairs(int N, int M)
	{
	    int res = 0;
	    for (int a = 1; a <= N; a++) {
	        int s = 1;
	        for (int x = 2; x <= a / x; x++) {
	            if (a % (x*x) == 0) {
	                s = x*x;
	            }
	        }
	        int r = a / s;
	        for (int y = 1; y*y*r <= M; y++) {
	            res++;
	        }
	    }
    	return res;
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
