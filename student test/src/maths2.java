
public class maths2 {
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("mul of C "+c);
		return c;	
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Sub of C "+c);
		return c;	
	}
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum of C "+c);
		return c;	
	}
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("div of C "+c);
		return c;	
	}
	public static void main(String[] args) {

		maths2 obj = new maths2();
		int mul=obj.mul(10,2);
		int sub1=obj.sub(mul,2);
		int sum=obj.sum(sub1,2);
		int sub2=obj.sub(sum,2);
		obj.div(sub2,2);
	}

}
