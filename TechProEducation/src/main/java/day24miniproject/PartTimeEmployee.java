package day24miniproject;

public class PartTimeEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(Long id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);

        if(hourlyRate < 0)
            throw new InvalidEmployeeDataException("Invalid data, hourly rate can't be negative");

        if(hoursWorked < 0)
            throw new InvalidEmployeeDataException("Invalid data, the worked hours can't be negative");

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}
