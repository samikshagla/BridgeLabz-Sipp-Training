public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationFee);
    }
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        Vehicle v2 = new Vehicle("Bob", "Bike");
        v2.displayVehicleDetails();
    }
} 