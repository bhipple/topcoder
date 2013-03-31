import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class CityMap
{
  public String getLegend(String[] cityMap, int[] POIs)
	{
		char[] ans = new char[POIs.length];
			
		Hashtable hash = new Hashtable();
			
		for(int i=0; i<cityMap.length; i++) {
			for(int j=0; j<cityMap[i].length(); j++) {
				char cur = cityMap[i].charAt(j);
				int k = 1;
				if(!hash.containsKey(cur)) {
					hash.put(cur, k);
				} else {
					int prev = (int) hash.get(cur);
					hash.remove(cur);
					hash.put(cur, prev + 1);
				}
			}
		}
		
		Enumeration vals = hash.keys();
		while(vals.hasMoreElements()) {
			char c = (char) vals.nextElement();
	
			for(int i=0; i<POIs.length; i++) {
				if(hash.get(c) == POIs[i]) {
					ans[i] = c;
				}
			}
		}
		
		String str = new String(ans);
		
		return str;
	}
}
