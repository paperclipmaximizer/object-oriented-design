public class Employee extends Person {
    private int employee_number;
    private String name;
    public int getEmployeeNum() {
        return employee_number;
    }
    public void setEmployeeNum(int eNum) {
        this.employee_number = eNum;
    }
    public String getEmployeeName() {
        return name;
    }
    public void setEmployeeName(String eName) {
        this.name = eName;
    }
}