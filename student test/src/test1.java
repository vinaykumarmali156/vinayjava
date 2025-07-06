

public class test1 {

	int age , rollno;
	
	public void display1() {
		System.out.println("welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		test1 std=new test1();
		std.display1();
		std.display2();
		std.age=30;
		std.rollno=25;
		System.out.println("RollNo is "+std.rollno);
		System.out.println("AGE is "+std.age);
	}

}
