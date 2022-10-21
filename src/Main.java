public class Main {

    private static boolean isLeapYear(int year) { //Задание 1
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        return isLeapYear;
    }

    private static void extracted(int clientOS1, int clientDeviceYear) { //Задание 2
        if (clientOS1 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static int days (int deliveryDistance){ //Задание 3
        int days = 1;
        if (deliveryDistance > 20){
            days++;
        }
        if (deliveryDistance > 60){
            days++;
        }
        return days;
    }
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1!!!");
        int year = 2022;
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        //Задание 2
        System.out.println("Задание 2!!!");
        int clientOS1 = 1;
        int clientDeviceYear = 2022;
        extracted(clientOS1, clientDeviceYear);
        //Задание 3

        System.out.println("Задание 3!!!");
        int deliveryDistance = 95;

        int totalDays = days(deliveryDistance);
        System.out.println("Потребуется дней для доставки " + totalDays);

    }

}