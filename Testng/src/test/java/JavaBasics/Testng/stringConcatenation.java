package JavaBasics.Testng;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class stringConcatenation {
	
		 public static void main(String args[]) throws IOException{  
			 
		   //Note: After a string literal, all the + will be treated as string concatenation operator. 
//		   String s=50+30+"Sachin"+40+40;  
//		   System.out.println(s);//80Sachin4040  
//		   String url = "https://vikrampk11.atlassian.net/projects/QS/issues/";
//		   String key = "qs-1";
//		   System.out.println(url+key);
			
			 
			 
			StringBuilder str = new StringBuilder("sel\n" + 
					"\n" + 
					"region_name,\n" + 
					"\n" + 
					"sum(buyer_churn),\n" + 
					"\n" + 
					"sum(merchant_churn), sum (buyer_churn+merchant_churn) as ChurnTotal,\n" + 
					"\n" + 
					"sum(BUYER_ACTIVES_ACT),\n" + 
					"\n" + 
					"sum(MERCHANT_ACTIVES_ACT), sum(BUYER_ACTIVES_ACT+MERCHANT_ACTIVES_ACT) as ActivesTotal,\n" + 
					"\n" + 
					"sum(BUYER_RE_ACTIVATION),\n" + 
					"\n" + 
					"sum(MERCHANT_RE_ACTIVATION), sum(BUYER_RE_ACTIVATION+MERCHANT_RE_ACTIVATION) as ReactivationsTotal,\n" + 
					"\n" + 
					"sum(BUYER_NNA_ACTUAL),\n" + 
					"\n" + 
					"sum(MERCHANT_NNA_ACTUAL), sum(BUYER_NNA_ACTUAL+MERCHANT_NNA_ACTUAL) as NNATotal,\n" + 
					"\n" + 
					"sum(BUYER_NEW_ACTIVATION),\n" + 
					"\n" + 
					"sum(MERCHANT_NEW_ACTIVATION), sum(BUYER_NEW_ACTIVATION+MERCHANT_NEW_ACTIVATION) as NewActivationsTotal\n" + 
					"\n" + 
					"from PP_scratch.FACT_CUSTOMERS_TMIS_DLY_ARCH_640 where cal_dt between  '2018/07/01' and '2018/08/05' and Region_Name='' and Sub_Market_Name\n" + 
					"\n" + 
					"group by 1\n" + 
					"\n" + 
					"order by 1") ;
			str.insert(706, "aaaa");
            str.insert(731, " aaaaaaaaa");
			System.out.println(str);
		 }
		}  

