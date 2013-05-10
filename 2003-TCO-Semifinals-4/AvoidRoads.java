import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class AvoidRoads
{
  	
	int[][] rightBlocked;
	int[][] upBlocked;
	int height;
	int width;

	public long numWays(int width, int height, String[] bad)
	{
		this.height = height;
		this.width = width;
		
		rightBlocked = new int[width][height];
		upBlocked = new int[width][height];
	
		for(int i=0; i<bad.length; i++) {
			int x1 = (int) bad[i].charAt(0);
			int y1 = (int) bad[i].charAt(2);
			int x2 = (int) bad[i].charAt(4);
			int y2 = (int) bad[i].charAt(6);
			
			if(x1 == x2)
				rightBlocked[x1][y1] = -1;
			else
				upBlocked[x1][y1] = -1;;
		}
		
		return dfs(0, 0);
		

	}
	
	public int dfs(int x, int y) {
		if(x == width - 1 && y == height - 1)
			return 1;
			
		int res = 0;
		if(x < width && !(rightBlocked[x][y] == -1))				
			res = dfs(x+1, y);
		if(y < height && !(upBlocked[x][y] == -1))
			res += dfs(x, y+1);
				

		return res;
	}
	
	<%:testing-code%>
}
//Powered by [KawigiEdit] 2.0!
