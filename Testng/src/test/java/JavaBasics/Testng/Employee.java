package JavaBasics.Testng;

public class Employee {

	int x=12;
//	private String name;
//	private  int s;
	public void method(int x)
	{
		x+=x;
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int i=5;
		arr[i++]=++i+i++;
		System.out.println(arr[5]+":"+arr[6]);

	}

}
