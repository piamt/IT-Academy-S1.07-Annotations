package org.example;

import java.math.BigDecimal;

@JSONSerializable(directory = "src/main/files/myfile.json")
public class Worker {

    protected String name;
    private String surname;
    protected BigDecimal salaryPerHour;

    public Worker(String name, String surname, BigDecimal salaryPerHour) {
        this.name = name;
        this.surname = surname;
        this.salaryPerHour = salaryPerHour;
    }

    public BigDecimal calculateSalary(Integer hours) {
        return (BigDecimal.valueOf(hours).multiply(this.salaryPerHour));
    }
}//BigInt
