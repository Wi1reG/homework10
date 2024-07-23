//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void chekYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year != 0) {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void chekOS(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void chekDistance(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("На доставку карты потребуется " + day + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = day + 1;
            System.out.println("На доставку карты потребуется " + day + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("На доставку карты потребуется " + day + " дня");
        } else {
            System.out.println("Доставки карты нет");
        }
    }


    public static void main(String[] args) {
        chekYear(2020);
        chekOS(0, 2001);
        chekDistance(95);
    }
}