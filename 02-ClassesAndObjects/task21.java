public class task21 {
    int height = 180;
    double height_foot = height / 30.48;
    double height_inch = (height % 30.48) / 2.54;

    public static void main(String[] args) {
        task21 converter = new task21();
        System.out.println("My height is: " + converter.height + " in cm");
        System.out.println("My height is: " + converter.height_foot + " in feet");
        System.out.println("My height is: " + converter.height_inch + " in inches");
    }
}