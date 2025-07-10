package application;
import java.util.Scanner;

import utilities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Entrar com número da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Entrar com o nome: ");
		String holder = sc.nextLine();
		
		System.out.print("Deseja realizar um depósito incial? (s/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'S' || response == 's') {
			System.out.print("Digite o valor do depósito: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);	
		}
		
		updateAccount(account);
		
		char continueResponse;
		
		do {
		
		System.out.println("--------------------------");
		System.out.println("Deseja realizar um depósito? (s/n) ");
		char depositResponse = sc.next().charAt(0);
		
		if (depositResponse == 'S' ||depositResponse == 's') {
			System.out.print("Digite o valor do depósito: ");
			 double depositValue = sc.nextDouble();
			 account.deposit(depositValue);
			 updateAccount(account);
		}
		
		
		System.out.println("--------------------------");
		System.out.println("Deseja realizar um saque? (s/n) ");
		char withdrawResponse = sc.next().charAt(0);
		
		if (withdrawResponse == 'S' || withdrawResponse == 's') {
			System.out.print("Digite o valor do saque: ");
			 double withdrawValue = sc.nextDouble();
			 account.withdraw(withdrawValue);
			 updateAccount(account);
			}
		
		
		System.out.println("--------------------------");
		System.out.println("Deseja realizar uma nova operação? (s/n) ");
		continueResponse = sc.next().charAt(0);
		
		}
		while (continueResponse == 's' || continueResponse == 'S');
		
		System.out.println("Operação finalizada!");
		
		sc.close();
		
}
	public static void updateAccount(Account account) {
		 System.out.println("--------------------------");
		 System.out.println("Atualização da conta: ");
		 System.out.print(account);
	}
}
