public class MyCalendar {
    static int year = 2024;
    static int month = 11;
    static int day = 30;

    static String MyDate() {
        return year + "-" + month + "-" + day;
    }
    static int days() {
        return 30 * month;
    }
static String monthName(int month) {
    switch (month) {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
        
    }
    return null;}
}
