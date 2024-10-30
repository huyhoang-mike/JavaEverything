import java.util.Arrays;

public class Array {
    public static void main(String arg[]) {
        int[] array = { 1, 2, 3 };
        array = Arrays.copyOf(array, array.length + 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}