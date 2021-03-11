package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
	
		System.out.println("Enter account data");
		System.out.print("Number:");
		Integer number = read.nextInt();
		System.out.print("Holder:");
		read.nextLine();
		String holder = read.nextLine();
		System.out.print("Initial Balance:");
		Double balance = read.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = read.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withDraw:");
		Double withdraw = read.nextDouble();
        
	try {
		
		account.withdraw(withdraw);
		System.out.println(account);
		
	}
	
	catch (DomainException e) {
		System.out.println("Error in withDraw: "+ e.getMessage());
	}

	read.close();

	}
}
