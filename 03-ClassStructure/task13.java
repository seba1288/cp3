import java.util.ArrayList;
import java.util.Arrays;

public class task13 {
    int[] arr;

    public int[] two2one(int[][] array) {
        arr = new int[array.length * array[0].length];
        int v = 0;
        for (int i = 0; i < array.length;i++ ) {
            for (int j = 0; j < array[0].length; j++) {
                arr[v] = array[i][j];
                v++;
            }
        }
        return arr;
    }
    public int[][]	swap(int[][] array) {
        for (int i  = 0; i< array.length; i++) {
            int temp = array[i][0];
            array[i][0] = array[i][array[i].length - 1];
            array[i][array[i].length - 1] = temp;
        }
        return array;
    }

    public int sumOflastColumn(int[][] array) {
        int result = 0;
        for ( int i = 0; i < array.length; i++) {
            result += array[i][array[i].length - 1];
        }
        return result;
    }
    public int secondMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
    
    public boolean exist(int number, int[] arr) {
        for ( int i = 0; i< arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<Integer> diffrent(int[] arr, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for ( int i =0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                result.add(arr2[i]);
            }
        }
        return result;
    }

    public boolean compare(int[] arr, int[] arr2) {
        if (Arrays.compare(arr, arr2)== 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public ArrayList<Integer> reverse() {
        ArrayList<Integer> result = new ArrayList<>();
        for ( int i = 0; i < arr.length-1; i++) {
            result.add(i, arr[arr.length - 1 - i]);
        }
        return result;

    }

    public int even(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public ArrayList<Integer> positiveOdd(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = { {12,1}, {35,1}, {1,1}, {10,1}, {34,1}, {1 , 2}};
        task13 o = new task13();
        o.sumOflastColumn(arr);
        o.two2one(arr);
    }
}
