package JavaBasics.Testng;

import java.math.BigDecimal;
import java.util.TreeMap;

public class numberCoversion {
	
	public void convertNumbers(float finalvalue,String metricName,TreeMap<String, Float> Map) {

        if(Math.abs(finalvalue)>=1000 && Math.abs(finalvalue)<1000000)
        {
            finalvalue = new BigDecimal(finalvalue/1000).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();

        }
        else if(Math.abs(finalvalue)>=1000000 && Math.abs(finalvalue)<1000000000)
        {
            finalvalue = new BigDecimal(finalvalue/1000000).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();

        }
        else if(Math.abs(finalvalue)>1000000000)
        {
            finalvalue = new BigDecimal(finalvalue/1000000000).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();

        }
        Map.put(metricName,finalvalue);
    }
}
