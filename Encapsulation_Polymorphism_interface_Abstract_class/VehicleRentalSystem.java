package Encapsulation_Polymorphism_interface_Abstract_class;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    protected String getInsurancePolicyNumber() { return insurancePolicyNumber; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return getRentalRate() * 0.10; }
    @Override
    public String getInsuranceDetails() { return "Car Insurance Policy: " + getInsurancePolicyNumber(); }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    @Override
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    @Override
    public String getInsuranceDetails() { return "Bike Insurance Policy: " + getInsurancePolicyNumber(); }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    @Override
    public double calculateInsurance() { return getRentalRate() * 0.15; }
    @Override
    public String getInsuranceDetails() { return "Truck Insurance Policy: " + getInsurancePolicyNumber(); }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 1000, "C-INS-001"),
            new Bike("BIKE456", 500, "B-INS-002"),
            new Truck("TRUCK789", 2000, "T-INS-003")
        };
        int days = 5;
        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber());
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable)v).calculateInsurance());
            }
            System.out.println();
        }
    }
} 