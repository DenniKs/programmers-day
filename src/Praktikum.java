import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " - год високосный.");// здесь нужно вывести результат
        } else {
            System.out.println(year + " - год не високосный.");
        }
    }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
} 