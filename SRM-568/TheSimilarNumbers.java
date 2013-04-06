import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheSimilarNumbers
{
  public int find(int lower, int upper)
	{
		int res = 0;
		for(int i=lower; i <= upper; i = i*10 + 1) {
			res++;
		}
		return res;
	}
}
