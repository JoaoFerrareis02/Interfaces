package model.services;

public class PaypalService implements OnlinePaymentService {
	
	private static final double PAYMENT_FEE = 0.02;
	private static final double SIMPLE_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double ammount) {
		return ammount * PAYMENT_FEE;
	}

	@Override
	public double interest(double ammount, int months) {
		return ammount * SIMPLE_INTEREST * months;
	}

}
