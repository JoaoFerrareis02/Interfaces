package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePayment;

	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public void processContract(Contract contract, int months) {
		double value = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double interest = onlinePayment.interest(value, i);
			double fee = onlinePayment.paymentFee(value + interest);
			double ammount = value + interest + fee;
			LocalDate dueTime = contract.getDate().plusMonths(i);
			contract.getInstallments().add(new Installment(dueTime, ammount));
		}
	}

}
