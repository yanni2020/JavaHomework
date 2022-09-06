package DesignPattern;

/**
 * Observer
 */
public class Truck implements Vehicle{
    private String owner, brand;

    Truck(String owner, String brand) {
        this.owner = owner;
        this.brand = brand;
    }

    @Override
    public void getNotify() {
        System.out.println(owner + "\'s " + brand + "(Truck) get notified!");
    }
    
}
