package hello;

abstract class A{
	abstract void add(int a,int b);
	abstract void sub (int a,int b);
	
}

class B extends A {
	public void add(int a,int b) {
		int addition=a+b;
		System.out.println(addition);
	}
	public void sub(int a,int b) {
		int subraction=a-b;
		System.out.println(subraction);
	}
	
	
}

public class Abstract {
	
	public static void main(String args[]) {
		A calc;
		calc = new B();
		calc.add(10, 10);
		calc.sub(20, 10);
	}

}
