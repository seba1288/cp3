public class task24 {
    public static void main(String[] args) {
        float buy_rate = 4.5940f;
        float sell_rate = 4.6250f;
        System.out.println("Buy rate: " + buy_rate);
        System.out.println("Sell rate: " + sell_rate);
        System.out.println("Spread: " + Math.round((sell_rate - buy_rate) * 1000000d) / 1000000d);
        
    }
}
