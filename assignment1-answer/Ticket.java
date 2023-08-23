public class Ticket {
    private int ticketNumber;
    public String seatNumber;
    public int getTicketID() {
        return ticketNumber;
    }
    public void setTicketID(int tNum) {
        this.ticketNumber = tNum;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumString) {
        this.seatNumber = seatNumString;
    }
}