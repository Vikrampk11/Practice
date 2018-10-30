package JavaBasics.Testng;

//import RestAssured.Create_Issue_Jira;

public class stringBuilder {

	public static void main(String[] args) {
//		StringBuffer str1 = new StringBuffer ("{\"channel\":\"CBTSS9ZPS\",\"text\":\"\"}");
//		String url = "https://vikrampk11.atlassian.net/projects/QS/issues/";
	//	String key_val = (String) Create_Issue_Jira.key_val;
		
//		String name = "QS-01";
//		String issue_url= url+name;
//		str1.insert (31, issue_url);
//		System.out.println (str1);

		// Java program to demonstrate working of split()
		
		        String str = "GeeksforGeeks:A Computer: Science Portal";
		        String [] arrOfStr = str.split(":");
		 
		        for (String a : arrOfStr)
		            System.out.println(a);
		        
		        String str1= new String("quick brown fox jumps over the lazy dog");
		        System.out.println("Substring starting from index 15:");
		        System.out.println(str1.substring(15));
		        System.out.println("Substring starting from index 15 and ending at 20:");
		        System.out.println(str1.substring(15, 20));
		    }
		
	

}
