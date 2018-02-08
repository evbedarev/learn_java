public class trenar {
    public static void main(String args[]) {
        int x = 3;
        int y = 4;
        System.out.println(factorial(11));

    }
    static int factorial(int x) {
        if (x==1) {
            return 1;
        }
        else {
            return x * factorial(x-1);
        }
    }
}
