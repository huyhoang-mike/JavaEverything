public class Recursive {
    public static int recursiveAdd(int k) {
        if (k > 0) {
            return k + recursiveAdd(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursiveAdd(5));
    }
}