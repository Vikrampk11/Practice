package JavaBasics.Testng;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class Use_2_dataProviders {
	public Object[][] dp1() {
		  return new Object[][] {
		      new Object[] { "a", "b" },
		      new Object[] { "c", "d" },
		  };
		}

		public Object[][] dp2() {
		  return new Object[][] {
		      new Object[] { "e", "f" },
		      new Object[] { "g", "h" },
		  };
		}

		@DataProvider(name="test")
		public Object[][] dp() {
		  List<Object[]> result = Lists.newArrayList();
		  result.addAll(Arrays.asList(dp1()));
		  result.addAll(Arrays.asList(dp2()));
		  return result.toArray(new Object[result.size()][]);
		}

		@Test(dataProvider = "test")
		public void f(String a, String b) {
		  System.out.println("f " + a + " " + b);
		}
}
