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
public class HotelRoom extends HolidayResort {
    private int roomNumber;
    private boolean breakfast;

    public HotelRoom(String clientName, String bookingRefrence, String startDate, int roomNumber, int duration) {
        super(clientName, bookingRefrence, startDate, roomNumber, duration);
        this.roomNumber=69;
        this.breakfast=true;
    }

public HotelRoom(){
    roomNumber=69;
    
}



    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }
    
    
}
