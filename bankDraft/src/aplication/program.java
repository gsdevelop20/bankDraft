package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Account> account = new ArrayList<>();

		int i = 0;
		

		while (i == 0) {
			System.out.println("1 - Open accountt");
			System.out.println("2 - Your balance");
			System.out.println("3 - withdrawal");
			int op = sc.nextInt();

			if (op == 1) {
				sc.nextLine();
				System.out.println("Name");
				String name = sc.nextLine();
				System.out.println("Number Account");
				int numAccount = sc.nextInt();
				sc.nextLine();
				System.out.println("Balance");
				double balance = sc.nextDouble();

				account.add(new Account(name, numAccount, balance));

				System.out.println("");
				
				

			}

			if (op == 2) {
				System.out.println("whats your number account?");
				int acc = sc.nextInt();
				while (getPos(account, acc) == null) {
					System.out.println("Account don´t exist ");
					acc = sc.nextInt();

				}

				Integer pos = getPos(account, acc);
				System.out.println("");
				System.out.println("Saldo:");
				System.out.println(account.get(pos).toString());
				System.out.println("");

			}

			if (op == 3) {
				System.out.println("");
				System.out.println("whats your number account?");
				int acc = sc.nextInt();
				while (getPos(account, acc) == null) {
					System.out.println("Account don´t exist ");
					acc = sc.nextInt();
				}
				System.out.println("");
				Integer pos = getPos(account, acc);
				System.out.println("Wellcome: " + account.get(pos).getName());
				System.out.println("");
				System.out.printf("Your balance: %.2f",account.get(pos).getBalance());
				System.out.println("");

				System.out.println("How much do you want to withdraw?");
				double value = sc.nextDouble();

				account.get(pos).withdrawal(value);
				System.out.printf("Your balance now: %.2f",account.get(pos).getBalance());
				System.out.println("");

			}

		}

	}

	public static Integer getPos(List<Account> acc, int numberAcc) {
		for (int i = 0; i < acc.size(); i++) {
			if (acc.get(i).getNumAccount() == numberAcc) {
				return i;
			}
		}
		return null;
	}
}
