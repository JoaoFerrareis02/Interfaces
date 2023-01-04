package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterstService;
import model.services.InterestService;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService bis = new BrazilInterstService(2.0);

		System.out.printf("Payment after %d months:\n", months);

		double payment = bis.payment(amount, months);

		System.out.printf("%.2f\n", payment);

		sc.close();

	}

}
