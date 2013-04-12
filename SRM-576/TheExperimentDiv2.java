import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheExperimentDiv2
{
  public int[] determineHumidity(int[] intensity, int L, int[] leftEnd)
	{
		int[] res = new int[leftEnd.length];

		for(int s=0; s<leftEnd.length; s++) {
			for(int x=leftEnd[s]; x < leftEnd[s] + L; x++) {
				if(x < intensity.length) {
					res[s] += intensity[x];
					intensity[x] = 0;
				}
			}
		}
		return res;
	}
}
//Powered by [KawigiEdit] 2.0!
