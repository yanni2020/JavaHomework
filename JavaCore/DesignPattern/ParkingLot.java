package DesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 3) Implement the (in-class) PARKING LOT OOP design system -> your 
 *    implementation should include main method and is runnable.
 * 
 *    This case apples Observer pattern
 *    Parking Lot -> Subject
 *    Queueing vehicles -> Observers
 *    When Parking Lot has space, Queueing vehicles would be notified.
 *    Assume parking vehicle number would never exceed maximum space.
 */

public class ParkingLot {
    private static final int MAX_SPACE = 100;
    private static int currentParkingNumber;
    private static List<Vehicle> waitingList;

    ParkingLot(int currentParkingNumber){
        ParkingLot.currentParkingNumber = currentParkingNumber;
        ParkingLot.waitingList = new ArrayList<>();
    }
    ParkingLot(){
        ParkingLot.currentParkingNumber = 0;
        ParkingLot.waitingList = new ArrayList<>();
    }

    public void droveIn(){currentParkingNumber++;}
    public void droveAway(){currentParkingNumber--;}

    /**
     * Add Vehicle into waiting list.
     * @param vehicle
     */
    public void add(Vehicle vehicle){waitingList.add(vehicle);}

    /**
     * Remove vehicle from waiting list.
     * @param vehicle
     */
    public void remove(Vehicle vehicle){waitingList.remove(vehicle);}

    /**
     * When Parking lot has space, notify all vehicle in waiting list.
     */
    public void notice(){
        if(currentParkingNumber >= MAX_SPACE)
            System.out.println("Parking Lot is full!");
        else{
            System.out.println("There are " + (MAX_SPACE - currentParkingNumber)
             + " free space in Parking Lot!");
            for(Vehicle vehicle: waitingList){
                vehicle.getNotify();
            }
        }
    }

    public static void main(String[] args) {
        ParkingLot pl = new ParkingLot(98);
        pl.add(new Truck("owner_1", "Ford"));
        pl.add(new Auto("owner_2", "Toyota"));
        pl.add(new Truck("owner_3", "GMC"));
        pl.add(new Truck("owner_4", "Chevelot"));
        pl.add(new Auto("owner_5", "Honda"));
        pl.add(new Auto("owner_6", "Nissan"));

        pl.notice();
        pl.droveIn();
        pl.droveIn();
        pl.notice();
        pl.droveAway();
        pl.notice();

    }
}
