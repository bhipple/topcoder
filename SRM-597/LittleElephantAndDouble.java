import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class LittleElephantAndDouble
{
	public String getAnswer(int[] A)
	{
		while(A[0] % 2 == 0)
			A[0] /= 2;
			
		int prime = A[0];
		for(int i=1; i<A.length; i++) {
			while(A[i] % 2 == 0)
				A[i] /= 2;
			
			if(A[i] != prime)
				return "NO";
		}
		return "YES";
	}
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
