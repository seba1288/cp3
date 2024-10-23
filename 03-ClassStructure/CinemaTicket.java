public class CinemaTicket {
    static String name = "Cinema NAME";
    String film; 
    String title;
    int row;
    int seat;
    double price;

    public String TicketDisplay(String film,String title,int row,int seat, double price) {
        return "Cinema: " + name + "\n" +
                "Film: " + film + "\n" +
                "Title: " + title + "\n" +
                "Row: " + row + "\n" +
                "Seat: " + seat + "\n" +
                "Price: " + price;
    }
}
