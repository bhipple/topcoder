import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class EasyHomework
{
  public String determineSign(int[] A)
	{
		int negCount = 0;
		
		for(int i=0; i<A.length; i++) {
			if(A[i] == 0)
				return "ZERO";
			if(A[i] < 0)
				negCount++;
		}
		
		if(negCount % 2 != 0) 
			return "NEGATIVE";
		else
			return "POSITIVE";
	}
}
