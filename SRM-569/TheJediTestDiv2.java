import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheJediTestDiv2
{
 public int countSupervisors(int[] students, int Y, int J)
 {
  int jedis = 0;
  int yodaSaves = 0;
  int jedisWithYoda, jedisWithoutYoda;
  for(int floor = 0; floor<students.length; floor++) {
   jedisWithYoda = Math.max(0, (students[floor] - Y) / J);
   if((students[floor] - Y) % J != 0 && ((students[floor] - Y) > 0)) 
    jedisWithYoda++;
   jedisWithoutYoda = (students[floor] / J);
   if((students[floor] % J) != 0)
    jedisWithoutYoda++;
    
   yodaSaves = Math.max(yodaSaves, (jedisWithoutYoda - jedisWithYoda));
   jedis += jedisWithoutYoda;
  }
  
  return jedis - yodaSaves;
 }
}
