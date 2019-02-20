package corejava.inhertance;

class Account {
	int accno;
	String name;
	int aadh;

	public Account(int accno, String name, int aadh) {
		super();
		this.accno = accno;
		this.name = name;
		this.aadh = aadh;
	}

	public void display() {
		System.out.println("Account no : " + accno);
		System.out.println("Account name : " + name);
		System.out.println("Aadhar number : " + aadh);
		System.out.println("---");
	}

	{
		System.out.println("Acc IIB");
	}

}

class Savings extends Account {

	int minbal;

	Savings(int aa, String bname, int add, int minbal) {
		super(aa, bname, add);
		super.display();
		System.out.println("Minimun bal : " + minbal);
	}
	
	@Override
	public void display() {
		super.display();
	}

	{
		System.out.println("IIB");
	}

}

class Current extends Account {
	public Current(int accno, String name, int aadh) {
		super(accno, name, aadh);
		System.out.println();
	}

	int max = 100000;
	
	

}

public class InhertanceExample {
	public static void main(String[] args) {
		// Account a = new Account(101,"rajesh",7854);
		// a.display();
		Account b = new Savings(20355, "Lakshman", 8088, 600);
		b.display();
		
	}

}
