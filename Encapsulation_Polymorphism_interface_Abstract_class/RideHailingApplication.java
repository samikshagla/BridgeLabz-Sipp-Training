package Encapsulation_Polymorphism_interface_Abstract_class;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = location;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm + ", Location: " + location);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return getLocation(); }
    @Override
    public void updateLocation(String newLocation) { setLocation(newLocation); }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override
    public String getCurrentLocation() { return getLocation(); }
    @Override
    public void updateLocation(String newLocation) { setLocation(newLocation); }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 1.2; }
    @Override
    public String getCurrentLocation() { return getLocation(); }
    @Override
    public void updateLocation(String newLocation) { setLocation(newLocation); }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("CAR123", "Alice", 15, "Downtown"),
            new Bike("BIKE456", "Bob", 10, "Uptown"),
            new Auto("AUTO789", "Charlie", 12, "Station")
        };
        double distance = 10;
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
                ((GPS)v).updateLocation("Airport");
                System.out.println("Updated Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println();
        }
    }
} 