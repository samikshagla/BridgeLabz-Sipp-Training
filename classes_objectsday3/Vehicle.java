
class Vehicle {
    private static double registrationFee = 5000.0;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car", "REG123");
        Vehicle v2 = new Vehicle("Sita", "Bike", "REG456");
        v1.displayDetails();
        v2.displayDetails();
        updateRegistrationFee(6000.0);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
} 