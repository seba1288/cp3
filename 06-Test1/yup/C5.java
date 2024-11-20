public class C5 {
    public static String m(String t) {
        String result = "";
        int temp = 1;
        for (int i =0; i < t.length(); i++) {
            temp++;
            if (temp % 2 == 0)  {
                result += "+";
            }
            result += t.charAt(i);
    }
    return result.substring(1,result.length());
}
}