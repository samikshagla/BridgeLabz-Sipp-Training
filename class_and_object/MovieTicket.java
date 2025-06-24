import java.util.*;
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public void display() {
        System.out.println(movieName + " " + seatNumber + " " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int seat = sc.nextInt();
        double price = sc.nextDouble();
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(movie, seat, price);
        ticket.display();
    }
} 