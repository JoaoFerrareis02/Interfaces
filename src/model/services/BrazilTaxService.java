package model.services;

public class BrazilTaxService {

	public double tax(double ammount) {
		return ammount <= 100.00 ? ammount * 0.2 : ammount * 0.15;
	}

}
