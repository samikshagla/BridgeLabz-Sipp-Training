public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void display() {
        System.out.println(guestName + " " + roomType + " " + nights);
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);
        b1.display();
        b2.display();
        b3.display();
    }
} 