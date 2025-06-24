public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    public double totalCost() {
        return rentalDays * dailyRate;
    }
    public void display() {
        System.out.println(customerName + " " + carModel + " " + rentalDays + " " + totalCost());
    }
    public static void main(String[] args) {
        CarRental r = new CarRental("Alice", "Sedan", 5, 1000);
        r.display();
    }
}
