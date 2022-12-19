public class Main {
    public static void main(String[] args) {
        // Задание 6
        int Savings = 15_000;
        int Month = 1;
        for (;Month <= 108; Month ++) {
            Savings = Savings + (Savings * 7 / 100 );
            if (Month % 6 == 0) {
                System.out.println("Сумма накоплений в " + Month + " месяце, равняется " + Savings + " рублей");
            }
        }
    }
}