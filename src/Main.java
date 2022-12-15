public class Main {
    public static void main(String[] args) {
        // Задание 3
        int year = 0;
        int population = 12_000_000;
        while (year < 10) {
            year++;
            int birthrate = population / 1000 * 17;
            int mortalityRate = population / 1000 * 8;
            population = population + (birthrate - mortalityRate);
            System.out.println("Год " + year + ", численность начеления состовляет " + population);
        }
    }
}