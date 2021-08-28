
public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		int a=10;
		int b=20;
	
		System.out.println(a+b); //30
		System.out.println(b-a); //10
		System.out.println(a*b); //200
		System.out.println(a/b); //0
		System.out.println(a%b); //10
		
		//Relational Operators
		System.out.println(a<b); //true
		System.out.println(a>b); //false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		//Logical Operators
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		//Assignment Operators
		int c=100;
		
		c=a;
		System.out.println(c);//10
		c=b;
		System.out.println(c);//20
		
		c=100;
		c++;  //c=c+1; //increment operator
		System.out.println(c);
		c--; //c=c-1; //decrement operator
		System.out.println(c);
		c+=5; //c=c+5;
		System.out.println(c);
		c-=5; //c=c-5;
		System.out.println(c);
		
		

	}

}
