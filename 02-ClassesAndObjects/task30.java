public class task30 {
    public int value = 0;

    public void increase( int n) {
        this.value=+n;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int n) {
        this.value=-n;
    }

    public void reset() {
        this.value=0;
    }

    public int ShowValue() {
        return this.value;
    }

    public static  void main(String[] args) {
        task30 couter1 = new task30();
        task30 couter2 = new task30();
        couter1.increase(23);
        couter2.decrease(47);
        System.out.println(couter1.ShowValue());
        System.out.println(couter2.ShowValue());
    }
}
