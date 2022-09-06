package DesignPattern;

/**
 * Observer
 */
public class Auto implements Vehicle {
    private String owner, brand;

    Auto(String owner, String brand) {
        this.owner = owner;
        this.brand = brand;
    }

    @Override
    public void getNotify() {
        System.out.println(owner + "\'s " + brand + "(Auto) get notified!");
    }
    
}
