package service;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService  onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double share = contract.getTotalValue() / months;
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(share, i);
            double fee = onlinePaymentService.paymentFee(share + interest);
            double amount = share + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, amount));
        }
    }
}
