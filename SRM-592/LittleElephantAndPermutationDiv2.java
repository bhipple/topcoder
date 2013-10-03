import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class LittleElephantAndPermutationDiv2
{
	int[] pA;
	int[] pB;
	int K;
	int N;
	long ct = 0;
	
	public long getNumber(int N, int K)
	{
		pA = new int[N+1];
		pB = new int[N+1];
		this.K = K;
		this.N = N;
		
		for(int i=0; i<pA.length; i++)
			pA[i] = i;
		
		for(int i=0; i<pB.length; i++)
			pB[i] = i;
		
		rec(1);
		
		int fact = 1;
		for(int i=1; i<=N; i++)
			fact = fact * i;	
		
		return ct * fact;
	}
	
	public void rec(int n) {
		if(n == (N + 1)) {
			evaluate();
		}
		
		for(int i=n; i<=N; i++) {
			int temp = pA[i];
			pA[i] = pA[n];
			pA[n] = temp;
			
			rec(n+1);
			
			pA[n] = pA[i];
			pA[i] = temp;
		}
	}
	
	public void evaluate() {
		int mgk = 0;
		for(int i=0; i<=N; i++)
			mgk += Math.max(pA[i], pB[i]);
		
		if(mgk >= K)
			ct++;
	}
}
//Powered by [KawigiEdit] 2.0!
