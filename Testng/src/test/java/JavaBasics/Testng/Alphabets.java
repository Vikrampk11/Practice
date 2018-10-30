package JavaBasics.Testng;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Alphabets
{
public static void main(String args[])
{
char ch;
int i, sum=0, total=0;
String s = "MAN";
Map<Character,Integer> problem = new HashMap<Character,Integer>();
int  value1 = 0, value2 = 1;
for (ch = 'A', i = 1; ch <= 'Z'; ch++, ++i)
{	
		
	problem.put(ch, sum);
	sum = value1 + value2;        
	value1 = value2;
	value2 = sum;
    
}
System. out. println(problem);
char [] letter = s.toCharArray();

for(int j=0; j<letter.length; ++j)
{
	
	for (Entry<Character, Integer> entry : problem.entrySet())
	{
		if(entry.getKey().equals(letter[j]))
		{
			//System.out.println(entry.getValue());
			total= total+ entry.getValue();
		}
	   
	}

}
System.out.println(total);
}
}