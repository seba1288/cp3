public class C4 {
    private int hour;
    private int minutes;

    public C4(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public void add() {
        this.minutes++;
        if(this.minutes == 60) {
            this.hour += 1;
            this.minutes = 0;
            if(hour ==24) {
                this.hour = 0;
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour > 0 && hour <= 23){
        this.hour = hour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes > 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }



}
