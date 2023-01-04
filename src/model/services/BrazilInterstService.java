package model.services;

public class BrazilInterstService implements InterestService {

	private double interestRate;

	public BrazilInterstService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
