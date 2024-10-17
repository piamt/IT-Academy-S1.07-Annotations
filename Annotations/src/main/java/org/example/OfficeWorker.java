package org.example;

@SuppressWarnings("Deprecated") // TODO: No cambia nada?
public class OfficeWorker extends Worker {

    static int gas = 100;

    public OfficeWorker(String name, String surname, int salaryPerHour) {
        super(name, surname, salaryPerHour);
    }

    @Override
    public int calculateSalary(int hours) {
        return (hours * this.salaryPerHour) + gas;
    }

    @Deprecated
    public String getNameWorker() {
        return this.name;
    }
}
