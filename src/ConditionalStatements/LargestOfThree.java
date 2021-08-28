package ConditionalStatements;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int a=10;
		int b=100;
		int c=70;
		
		if(a>b && a>c)
		{
			System.out.println("A is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest");
		}
		else
		{
			System.out.println("C is largest");
		}

	}

}
