public class task12 {
    public int a=5;
    public int c;

    public task12(int a, int c) {
        this.a = a;
        this.c = c;
    }

    public  int sumOfRange() {
        int value = 0;
        while(this.a!=this.c) {
            value += this.a;
            this.a++;
        }
        return value;
    }

    public  int arthimetricMean() {
        int value = 0;
        this.a = 5;
        while(this.a!=this.c) {
            value += this.a;
            this.a++;
        }
        return value/(range());
    }

    public int range() {
        return (c+1) - (a-1);

    }

    public static void main( String[] args) {
        task12 o = new task12(5, 10);
        System.out.println(o.range());
        System.out.println(o.sumOfRange());
        System.out.println(o.arthimetricMean());

    }
}
