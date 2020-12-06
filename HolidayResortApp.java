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
public class HolidayResortApp {
    int cost;
    
    public static void main(String[] args) {
        
        
        HolidayResort h1 = new HolidayResort("Michael", "OPOS56", "3/7/2020", 7, 5);
        HolidayResort h2 = new HolidayResort();
        HotelRoom hotel = new HotelRoom();
        Cottage c1 = new Cottage("David", "WJDW22", "1/9/2020",7,5);
        System.out.println(h1. getDetails());
     
        int cost = h2.getCost();
        System.out.println(h1.getClientName()+"'s"+" cost  is "+(h1.getDuration()*10+h1.getDuration()*cost)+ "\nDate and booking refrence is " + h1.getBookingRefrence()+" "+ h1.getStartDate()+"\nRoom Number: "+hotel.getRoomNumber());
        System.out.println(c1.getClientName()+"'s"+" cost  is "+(h1.getDuration()*60+h1.getDuration()*cost+50)+ "\nDate and booking refrence is " + c1.getBookingRefrence()+" "+ c1.getStartDate()+"\nAddress is: "+c1.getAddress()+"\nThe key Collection Point is: "+c1.getKeyCollectionPoint());
        
        
        
        
        
        
    }
    
}
