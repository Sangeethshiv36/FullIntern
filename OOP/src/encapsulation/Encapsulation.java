package encapsulation;

class Bank {
	private double balance;
	private long accno;
	private String name;

	public String getName() {
		return name;
	}

	public long getAccNo() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccNo(long accno) {
		this.accno = accno;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		obj.setName("Sangeeth");
		obj.setAccNo(727363887);
		obj.setBalance(40000);

		System.out.println("Account Holder Name : " + obj.getName() + "\nAccount No : " + obj.getAccNo()
				+ "\nBalance : " + obj.getBalance());

	}

}
