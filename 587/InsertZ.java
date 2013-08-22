import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class InsertZ
{
	public String canTransform(String init, String goal)
	{
		return goal.replace("z", "").equals(init) ? "Yes" : "No";
	}

}
