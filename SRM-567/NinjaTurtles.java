import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class NinjaTurtles
{
  public int countOpponents(int P, int K)
	{
		for(int i=0; i<10*P; i++) {
			if(P == 3 * (i/K) + (i/3))
				return i;
		}	
		return -1;
	}
}
//Powered by [KawigiEdit] 2.0!
