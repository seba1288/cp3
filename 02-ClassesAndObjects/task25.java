public class task25 {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;

        System.out.printf("time: %02d:%02d%n", hours, minutes);

        int minutesFromMidnight = hours * 60 + minutes;
        int secondsFromMidnight = minutesFromMidnight * 60;

        System.out.println("minutes from midnight: " + minutesFromMidnight);
        System.out.println("seconds from midnight: " + secondsFromMidnight);
    }
}