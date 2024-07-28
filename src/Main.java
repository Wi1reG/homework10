import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        checkYear(2024);
        checkOS(0);
        int day = calculateDistance(95);
        System.out.println("Дней до доставки карты: " + day);
        if (day == 0) {
            System.out.println("Доставки нет");
        }


    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOS(int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOs == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDistance(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            return day;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = day + 1;
            return day;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day = day + 2;
            return day;
        }
        if (deliveryDistance > 100) {
            day--;
            return day;
        }
        return day;
    }


}