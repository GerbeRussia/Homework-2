public class Main {
    public static void main(String[] args) {
        // Задание 1
        int totalSavings = 0;
        int savings = 15_000;
        int month = 0;
        while (totalSavings <= 2_459_000){
            month = month + 1;
            totalSavings = savings * month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
    }
}