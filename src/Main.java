public class Main {
    public static void main(String[] args) {

        // Задание № 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание № 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // Задание № 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        // Задание № 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задание № 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        // Задание № 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        // Задание № 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        // Задание № 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        // Задание № 9
        salary = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Задание № 10
        for (int i = 1; i < 11; i++) {

            System.out.println(i * 2);
        }
    }
}