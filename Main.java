
public class Main {

	public static void main(String[] args) {
		
     Bkaccount b =new Bkaccount("Amit",12365);
     
		b.deposit(1000);
		b.withdraw(100);
		b.withdraw(170);
		b.withdraw(130);
		
		b.getaccNm(11);
		
		
		System.out.println(b.tostring());
	}

}
