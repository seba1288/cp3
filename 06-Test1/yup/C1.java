public class C1 {
    
    public static int even(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length;i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i =0; i < array.length;i++) {
            int temp = array[array.length - i-1];
            result[i] = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] var2 = new int[]{33, 44, 55, 77, 99, 88, 88, 88};
        System.out.println(even(var2));
        System.out.println(reverse(var2)[0]);
        System.out.println(reverse(var2)[var2.length - 1]);
    }
    }

