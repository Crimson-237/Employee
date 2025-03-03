package io.growtogether.training_employee.infra.payment.mcbAdapter.service;

import io.growtogether.training_employee.domain.dto.Bank;
import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.domain.port.EmployeePaymentPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("MCB")
@Slf4j
public class McbAdapter implements EmployeePaymentPort {

    @Override
    public void makePayment(Employee employee) {
        // logic to make mcb payment
        log.info("MCB Payment for for employee {} , bank {}", employee.getFirstName(), employee.getBank());
    }

    @Override
    public Bank BankPayment() {
        return Bank.MCB;
    }
}
