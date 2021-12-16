package hello;
class Developer {
	void create() {
		System.out.println("Start Coding");
	}
}
 class Test extends Developer {
	void execute() {
		System.out.println("Execution of Code");
	}
 }
class Programmer {
		public static void main(String args[]) {
			Test emp = new Test();
			emp.create();
			emp.execute();
		}
}

