
public class maths {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum of C "+c);
		return c;	
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("sub of c "+c);
		return c;	
	}
	public int multi(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("multi of C "+c);
		return c;	 	
	}
	public void div (int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Div of C "+c);	 	
	}
	public static void main(String[] args) {
	
		maths obj = new maths();
		int sum1=obj.sum(10,2);
		int sum2=obj.sum(sum1,2);
		int sub=obj.sub(sum2,2);
		int multi=obj.multi(sub,2);
		obj.div(multi,2);
	}

}
