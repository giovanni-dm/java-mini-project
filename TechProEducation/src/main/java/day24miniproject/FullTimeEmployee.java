package day24miniproject;

public class FullTimeEmployee extends Employee {

    protected double baseSalary;
    protected double bonus;
    protected double benefits;

    public FullTimeEmployee(Long id, String name, double baseSalary, double bonus, double benefits) {

        super(id, name);

        if(baseSalary < 0)
        throw new InvalidEmployeeDataException("Invalid data, salary can't be negative");

        if(bonus < 0 )
            throw new InvalidEmployeeDataException("Invalid data, bonus can't be negative");

        if( benefits < 0)
            throw new InvalidEmployeeDataException("Invalid data, benefits can't be negative");

        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.benefits = benefits;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }

        @Override
        public double calculateSalary () {
            return baseSalary + bonus + benefits;
        }

        @Override
        public String toString () {
            return "FullTimeEmployee{" +
                    "baseSalary=" + baseSalary +
                    ", bonus=" + bonus +
                    ", benefits=" + benefits +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
}

