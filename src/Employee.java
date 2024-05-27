public class Employee extends Object{
    private String occupation;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
