public class C3 {
    public int value = 0;
    
    public void increase() {
        this.value++;
    }
    public void increase(int n) {
        if (n >= 0){
            this.value += n;
        }
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int n) {
        if (n >= 0){
            this.value -= n;
        }
    }
    public int value() {
        return this.value;
    }

    public void cancel() {
        this.value = 0;
    }
}
