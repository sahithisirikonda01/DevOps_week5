public class factorial{

    static int findfactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(findfactorial(n));
    }
}
