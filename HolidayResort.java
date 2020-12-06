/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resorthotel;

/**
 *
 * @author porte
 */
public class HolidayResort {
    private String clientName;
    private String bookingRefrence;
    private String startDate;
    private int roomNumber;
    private int duration;
    private int cost;
    private int hotel10;
    

    public HolidayResort(String clientName, String bookingRefrence, String startDate, int roomNumber, int duration) {
        this.clientName = clientName;
        this.bookingRefrence = bookingRefrence;
        this.startDate = startDate;
        this.roomNumber = roomNumber;
        this.duration = duration;
    }

    public HolidayResort(){

        clientName = " ";
        bookingRefrence = " ";
        startDate = " ";
        roomNumber = 0;
        duration = 3;
        cost=160;
        
    }
    
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBookingRefrence() {
        return bookingRefrence;
    }

    public void setBookingRefrence(String bookingRefrence) {
        this.bookingRefrence = bookingRefrence;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
 
        public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getDetails(){
        return "Client Details: "+clientName+", "+bookingRefrence+", "+startDate+", "+roomNumber+", "+duration;
    }
    public int computeCost(){
        cost=(10*duration)+(duration*cost);
        return cost;
    }

    public int getHotel10() {
        return hotel10;
    }

    public void setHotel10(int hotel10) {
        this.hotel10 = hotel10;
    }


}
