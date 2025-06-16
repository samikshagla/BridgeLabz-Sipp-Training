public class ThirtySix{
    public static void main(String[] args) {
        // Check if correct number of arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        System.out.println("Day of the week (0=Sun, ..., 6=Sat): " + d0);
    }
}

