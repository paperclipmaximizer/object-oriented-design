public class Staff extends Employee {
    private String position;
    public String getPosition() {
        return position;
    } 
    public void setPosition(String pos) {
        this.position = pos;
    }
    public void work() {
        System.out.println("Staff is working");
    }
}