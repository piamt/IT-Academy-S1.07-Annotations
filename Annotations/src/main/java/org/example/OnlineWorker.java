package org.example;

public class OnlineWorker extends Worker {

    static int internet = 40;

    public OnlineWorker(String name, String surname, int salaryPerHour) {
        super(name, surname, salaryPerHour);
    }

    @Override
    public int calculateSalary(int hours) {
        return (hours * this.salaryPerHour) + internet;
    }
}
