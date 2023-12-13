import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1:");
        checkIsLeapYear(2020);
        checkIsLeapYear(2022);
        checkIsLeapYear(2023);
        checkIsLeapYear(2003);
        System.out.println("Задание №2:");
        os(0);
        os(1);
        System.out.println("Задание №3:");
        distance(5);
        distance(55);
        distance(65);
        distance(102);
    }

    //задание №1
    private static void checkIsLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //задача №2

    private static void os(int clientOS) {
        //задача2
        int clientDeviceYear = 2023;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
    }

    private static void distance(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("доставки нет");
        }
    }
}