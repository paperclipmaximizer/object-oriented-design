public class Flight {
    private int id;
    private int date;
    private String depString;
    private String arrString;
    public int getFlightID() {
        return id;
    }
    public void setFlightID(int Id) {
        id = Id;
    }
    public int getFlightDate() {
        return date;
    }
    public void setFlightDate(int Date) {
        date = Date;
    }
    public String getDep() {
        return depString;
    }
    public void setDep(String dep) {
        depString = dep;
    }
    public String getArr() {
        return arrString;
    }
    public void setArr(String arr) {
        arrString = arr;
    }
}
