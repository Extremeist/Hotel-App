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
public class Cottage extends HolidayResort{
    private String address;
    private char KeyCollectionPoint;

    public Cottage(String clientName, String bookingRefrence, String startDate, int roomNumber, int duration) {
        super(clientName, bookingRefrence, startDate, roomNumber, duration);
        this.address="Sharks 9";
        this.KeyCollectionPoint='x';
    }

    public Cottage(){
        this.address="Sharks 9";
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getKeyCollectionPoint() {
        return KeyCollectionPoint;
    }

    public void setKeyCollectionPoint(char KeyCollectionPoint) {
        this.KeyCollectionPoint = KeyCollectionPoint;
    }
    
    
}
