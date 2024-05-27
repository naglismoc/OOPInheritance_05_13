public class Employee extends Object{
    private String occupation;
    private double salary;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
