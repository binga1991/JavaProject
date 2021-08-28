package Loops;

public class BreakStatement {

	public static void main(String[] args) {
		
		// uses of break statement
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i); // will print 1..2..3..4 only
		}

	}

}
