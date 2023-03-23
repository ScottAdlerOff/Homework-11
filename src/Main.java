public class Main {
    public static int checkingYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        return year;
    }

    public static int checkingTypeAndYear(int os, int year) {
        if (os == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return os;
    }

    public static int chekingDistance(int distance, int day){
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (distance >= 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (distance >= 60 && distance <= 100)
            System.out.println("Потребуется дней: " + (day + 2));
        else {
            System.out.println("Доставки нет");
        }
        return distance;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задание №1");
        System.out.println(" ");
        int year = 2021;
        checkingYear(year);
    }

    public static void task2() {
        System.out.println(" ");
        System.out.println("Задание №2");
        System.out.println(" ");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkingTypeAndYear(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println("Задание №3");
        System.out.println(" ");
        int deliveryDistance = 95;
        int dayDelivery = 1;
        chekingDistance(deliveryDistance, dayDelivery);
    }
}