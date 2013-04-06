import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheSwapsDivTwo
{
  public int find(int[] sequence)
	{
		int res = 0;
		int same = 0;
		for(int i=0; i<sequence.length; i++) {
			for(int j=i+1; j<sequence.length; j++) {
				if(sequence[i] != sequence[j])
					res++;
				else
					same = 1;
			}
		}
		return res + same;
	}
}
