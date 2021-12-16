package hello;

class Password {
	String name="sheshank";
	private String pass;
	public String getPass() {
		return pass;
	
	}
	public void setPass(String pass) {
	this.pass= pass;
	}
	
}

public class Wifi extends Password {
	public static void main(String args[]) {
		Wifi obj = new Wifi();
		obj.setPass("hello");
		System.out.println(obj.getPass());
		
	}
	
}
