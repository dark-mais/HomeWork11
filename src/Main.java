public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static int year(){
        return 2024;
    }

    public static int os() {
        return 0;
    }

    public static int distance() {
        return 90;
    }

    private static void task1() {
        //задача1
        System.out.println("Задача №1.");
        int year = year();
        if (year >= 1584) {
            int year1 = year % 4;
            if (year1 == 0) System.out.println(year + " год является високосным");
            else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task2() {
        //задача2
        System.out.println("задача №2.");
        int clientOS2 = os();
        int clientDeviceYear = year();

        if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
    }

    private static void task3() {
        //задача3
        System.out.println("Задача №3.");
        int deliveryDistance = distance();
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