package JavaBasics.Testng;

import java.util.Arrays;

public class firstOccurence {

	public static void main(String[] args) {

		int[] a = {4,1,2,1,3,3,3,3,3,4,4,4,5,6,6};

	    Arrays.sort(a);
	    for(int j=0;j<a.length;++j)
	    	System.out.print(a[j]);
	    int nbOccurences = 1;

	    for (int i = 0, length = a.length; i < length; i++) {
	        if (i < length -1 ) {
	            if (a[i] == a[i + 1]) {
	                nbOccurences++;
	            }
	        } else {
	            System.out.println(a[i] + " occurs " + nbOccurences
	                    + " time(s)"); //end of array
	        }

	        if (i < length -1   && a[i] != a[i + 1]) {
	            System.out.println(a[i] + " occurs " + nbOccurences
	                    + " time(s)"); //moving to new element in array
	            nbOccurences = 1;
	        }

	    }


    }

}
