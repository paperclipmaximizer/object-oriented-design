public class Airline {
    private int id;
    public String name;
    public String getAirlineID() {
        return Integer.toString(id) + name;
    }
    public void setAirlineID(String newID) {
        this.id = Integer.parseInt(newID.substring(0, 1));
    }
    public void registerPlane(Plane newPlane) {
        // ... 
    } 
}