package utilities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
		this.balance = 0.0;
	}

	public Account(Integer number, String holder,double initialDeposit) {
		this.number = number;
		this.holder = holder;
		this.balance = initialDeposit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		this.balance -= amount + 5.00;
	}
	
	
	public String toString() {
		return "Conta: " + number + 
			   " Nome: " + holder + 
			   String.format(" Saldo: %.2f%n", balance);
	}
	
}


