public class task25 {
    public int  hours = 14;
    public int minutes = 27;
    public void time() {
        System.out.println("Time: " + hours + ":" + minutes);
        System.out.println("Minutes from midnight: " + (minutes));
        System.out.println("Seconds from midnight: " + (minutes * 60));
    }

    public static void main(String[] args) {
        task25 time = new task25();
        time.time();
    }
}



