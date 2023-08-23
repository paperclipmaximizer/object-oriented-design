public class Pilot {
    private String licenseNumber;
    public String getPilotID() {
        return licenseNumber;
    }
    public void setPilotID(String licenseString) {
        this.licenseNumber = licenseString;
    }
    public void fly(Flight flight) {
        flight.getFlightID();
    } 
}
