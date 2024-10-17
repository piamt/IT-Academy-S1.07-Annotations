package org.example;

@JSONSerializable(directory = "src/main/files/myfile.json")
public class Worker {

    protected String name;
    private String surname;
    protected int salaryPerHour;

    public Worker(String name, String surname, int salaryPerHour) {
        this.name = name;
        this.surname = surname;
        this.salaryPerHour = salaryPerHour;
    }

    public void display() {
        System.out.println("Hello annotation");
    }

    public int calculateSalary(int hours) {
        return hours * this.salaryPerHour;
    }
}
