import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheDevice
{
  public int minimumAdditional(String[] plates)
	{
		int res = 0;
		for(int i=0; i<plates[0].length(); i++) {
			int need = 0;
			int z = 0;
			int one = 0;
			for(int j=0; j<plates.length; j++) {
				if(plates[j].charAt(i) == '0')
					z++;
				else
					one++;
			}
			if(z < 1) 
				need++;
			while(one < 2) {
				need++;
				one++;
			}
			res = Math.max(res, need);
		}
		return res;
	}
}
