package practice;

public class StaticKeyword {
	
	public int x ;
	public static int y=10;
	
	{
		System.out.println("inside simple block");
	}
	
	public StaticKeyword() {
		// TODO Auto-generated constructor stub
		System.out.println("inside constr");
	}
	
	static{
		System.out.println("inside static block");
	}
	
	public static int z;
	
	public void func(){
		System.out.println("inside func");
	}
	
	public static void func1(){
		System.out.println("Inside static func");
	}

	public static void main(String[] args) {
		// checking if s.y creates runtime error ,ans-No ,just warning 
		/*StaticKeyword s = new StaticKeyword();
		s.x=10;
		StaticKeyword.y=20;
		System.out.println("x:"+s.x+" y:"+StaticKeyword.y);*/
		//StaticKeyword s1 = new StaticKeyword();
		//StaticKeyword.func1();
	}

}
