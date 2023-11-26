import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkYearLeap(100);
        System.out.println("Задача 2");
        recommendVer(1, 2021);
        System.out.println("Задача 3");
        int deliveryDays = calculateDeliveriDays(30);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней для доставки: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void checkYearLeap (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }
    public static void recommendVer(int clientOs, int clientYear) {
        int currentYear = LocalDate.now().getYear();
        int iOs = 0;
        int android = 1;
        if (clientOs == iOs) {
            if (clientYear >= currentYear) {
                System.out.println("Установите обычную версию для IOS");
            } else {
                System.out.println("Установите облегченную версию для IOS");
            }
        } else if (clientOs == android) {
            if (clientYear >= currentYear) {
                System.out.println("Установите обычную версию для android");
            } else {
                System.out.println("Установите облегченную версию для android");
            }
        } else {
            System.out.println("Извините, OS не поддерживается");
        }
    }
    public static int calculateDeliveriDays( int distance) {
        int deliveryDays = -1;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays =2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
    }
}