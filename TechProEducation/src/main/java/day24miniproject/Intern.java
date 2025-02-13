package day24miniproject;

public class Intern extends Employee {

    protected double stipend;

    public Intern(Long id, String name, double stipend) {
        super(id, name);

        if(stipend < 0)
            throw new InvalidEmployeeDataException("Invalid data, stipend can't be negative");

        this.stipend = stipend;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return this.stipend;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "stipend=" + stipend +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
