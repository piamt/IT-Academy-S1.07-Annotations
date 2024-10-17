package org.example;

import java.math.BigDecimal;

public class OnlineWorker extends Worker {

    private static final BigDecimal INTERNET = new BigDecimal("40");

    public OnlineWorker(String name, String surname, BigDecimal salaryPerHour) {
        super(name, surname, salaryPerHour);
    }

    @Override
    public BigDecimal calculateSalary(Integer hours) {
        return (BigDecimal.valueOf(hours).multiply(this.salaryPerHour).add(INTERNET));
    }
}
