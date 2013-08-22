import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class KeyDungeonDiv2
{
	public int countDoors(int[] doorR, int[] doorG, int[] keys)
	{
		int open = 0;
		for(int i=0; i<doorR.length; i++)
		{
			int whites = keys[2];
			if(doorR[i] > keys[0])
				whites -= (doorR[i] - keys[0]);
			if(doorG[i] > keys[1])
				whites -= (doorG[i] - keys[1]);
				
			if(whites >= 0)
				open++;
		}
		
		return open;
	}
	
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
