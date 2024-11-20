public class task27 {
    public String title = "The Lord of the Rings";
    public String author = "J.R.R. Tolkien";
    public int pages = 1178;

    public void TurnPage() {
        this.pages++;

    }

    public void TurnPage(int n) {
        this.pages= this.pages + n;

    }

    public static void main(String[] args) {
         task27 p = new task27();
         task27 o = new task27();
            p.TurnPage();
            o.TurnPage();
    }
}
