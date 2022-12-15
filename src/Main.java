public class Main {
    public static void main(String[] args) {
        // Задание 2
        int n = 0;
        while (n < 10) {
            n = n + 1;
            System.out.print(" " + n);
        }
        System.out.println();
        {
            for (; n >= 1; n --)
                System.out.print(" " + n);
        }
    }
}
