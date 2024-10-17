package org.example;

import java.math.BigDecimal;

public class OfficeWorker extends Worker {

    private static final BigDecimal GAS = new BigDecimal("100");

    public OfficeWorker(String name, String surname, BigDecimal salaryPerHour) {
        super(name, surname, salaryPerHour);
    }

    @Override
    public BigDecimal calculateSalary(Integer hours) {
        return (BigDecimal.valueOf(hours).multiply(this.salaryPerHour).add(GAS));
    }

    @Deprecated
    public String getNameWorker() {
        return this.name;
    }
}
