
public class cons {

	public cons() {
		this(1,2,3);
		System.out.println("default param");	
	}
public cons(int a) {
	this();
	System.out.println("1 param");
		
	}
public cons(int b,int c) {
	this(1);
	System.out.println("2 param");
}
public cons(int a,int b,int c) {
	
	System.out.println("3 param");
}

public static void main(String[] args) {
	
	cons obj=new cons(1,2);	
}
}
