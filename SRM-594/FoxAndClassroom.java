import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class FoxAndClassroom
{
	public String ableTo(int n, int m)
	{
		boolean coprime = true;
		for(int i=2; i<=Math.min(n, m); i++) {
			if(n % i == 0 && m % i == 0)
				coprime = false;
		}
		
		return coprime ? "Possible" : "Impossible";
	}
}
//Powered by [KawigiEdit] 2.0!
