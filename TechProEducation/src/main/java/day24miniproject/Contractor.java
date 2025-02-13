package day24miniproject;

public class Contractor extends Employee{

    protected double contractRate;
    protected int contractLength;


    public Contractor(Long id, String name, double contractRate, int contractLength) {
        super(id, name);

        if(contractRate < 0)
            throw new InvalidEmployeeDataException("Invalid data, contract rate can't be negative");

        if(contractLength < 0)
            throw new InvalidEmployeeDataException("Invalid data, contract length can't be negative");

        this.contractRate = contractRate;
        this.contractLength = contractLength;
    }

    public double getContractRate() {
        return contractRate;
    }

    public void setContractRate(double contractRate) {
        this.contractRate = contractRate;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    @Override
    public double calculateSalary() {
        return this.contractLength * this.contractRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractRate=" + contractRate +
                ", contractLength=" + contractLength +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
