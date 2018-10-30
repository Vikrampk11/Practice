package JavaBasics.Testng;



import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class getTestResult  {


@Test
public void teststackquestion() {

    boolean actual = true;
    boolean expected = true;
   Assert.assertEquals(actual, expected);

}


@AfterMethod
public void afterMethod(ITestResult result)
{
    try
 {
    if(result.getStatus() == ITestResult.SUCCESS)
    {

        //Do something here
        System.out.println("passed **********");
    }

    else if(result.getStatus() == ITestResult.FAILURE)
    {
         //Do something here
        System.out.println("Failed ***********");

    }

     else if(result.getStatus() == ITestResult.SKIP ){

        System.out.println("Skiped***********");

    }
}
   catch(Exception e)
   {
     e.printStackTrace();
   }

}
}
