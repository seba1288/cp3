public class task29 {
    public int a;
    public int b;

    public task29(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void surface() {
        System.out.println("Surface: " + (a * b));
    }

    public void demensions() {
        System.out.println("Demensions: " + a + "x" + b);
    }
}
