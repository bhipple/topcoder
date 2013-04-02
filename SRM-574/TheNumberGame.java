import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheNumberGame
{
  public String determineOutcome(int A, int B)
	{
		Integer t1 = new Integer(A);
		Integer t2 = new Integer(B);
		String x = t1.toString();
		String y = t2.toString();
		
		StringBuffer buff = new StringBuffer();
		for(int i=0; i<y.length(); i++) {
			buff.append(y.charAt(y.length() - i - 1));
		}
		String yR = buff.toString();
		
		if(!x.contains(y) && !x.contains(yR))
			return "Manao loses";
		else
			return "Manao wins";
	}
}
