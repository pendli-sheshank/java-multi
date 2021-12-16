package hello;
import java.util.*;

abstract class Bank{
	abstract void getRateofIntrest();
}

class SBI extends Bank {
	Scanner input= new Scanner(System.in);
	
	
	public void getRateofIntrest() {
		System.out.println("Enter Sum");
		int sumofIntrest = input.nextInt();
		System.out.println("Enter Time");
		int time = input.nextInt();
		System.out.println("Enter Rate");
		int rate = input.nextInt();
		float r = (sumofIntrest * (time * rate)/100);
		System.out.println(r);
		 System.out.println("Total amount :="+(sumofIntrest+r));
	}
}


 class BanksIntrest {
   public static void main(String args[]) {
	   Bank calc;
	   calc = new SBI();
	   calc.getRateofIntrest();
	  
   }
}
