public class Method {
    public static void checkAge(String name, int age) {
        if (age > 18) {
            System.out.println(name + " is over 18");
        }
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        checkAge("Mike", 21);
        checkAge("Hoang", 15);
        double dresult = plus(1.4, 2.3);
        System.out.println(dresult);
        int iresult = plus(2, 5);
        System.out.println(iresult);
    }
}
