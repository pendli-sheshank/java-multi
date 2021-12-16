package hello;

class WebApp{
	void web() {
		System.out.println("Web Application");
	}
}

class Android extends WebApp {
	void apk() {
		System.out.println("Android Application");
	}
}

class Enterprise extends Android {
	void ee() {
		System.out.println("Enterprise Application");
	}
}

public class Multilevel extends Enterprise {
	public static void main(String args[]) {
		Multilevel obj = new Multilevel();
		obj.web();
		obj.apk();
		obj.ee();
	}

}
