package Loops;

public class ContinueStatement {

	public static void main(String[] args) {
		
		
		// uses of continue statement
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue; // if condition true then continue else print
			}
			System.out.println(i); // except 5 all from 1-10 will be printed
		}

	}

}
