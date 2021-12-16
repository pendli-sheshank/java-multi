package hello;

class Parent {
	public void dev() {
		System.out.print("Developer");
	}
}

 public class Child extends Parent {
	
	
	public static void main(String args[]) {
		Child emp = new Child();
		emp.dev();
	}

}
