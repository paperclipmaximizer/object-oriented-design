public class Airport {
    private int id;
    public String name;
    public String getAirportID() {
        return Integer.toString(id);
    }
    public void setAirportID(String newID) {
        this.id = Integer.parseInt(newID);
    }
    public void registerAirline(Airline newAirline) {
        // ... 
    } 
}