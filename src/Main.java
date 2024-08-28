public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1.");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }


        System.out.println();
        System.out.println("Exercise 2.");
        int clientOSEx2 = 0;
        int clientDeviceYear = 2015;
        if (clientOSEx2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOSEx2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOSEx2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOSEx2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android" +
                    " по ссылке.");
        } else {
            System.out.println("Параметры введены некорректно.");
        }


        System.out.println();
        System.out.println("Exercise 3.");
        int year = 1588400;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year > 1584 && year4 == 0 && year100 != 0 || year > 1584 && year400 == 0) {
            System.out.println("Год високосный.");
        } else if (year > 1584 && year4 != 0 || year > 1584 && year100 == 0) {
            System.out.println("Год не високосный.");
        } else {
            System.out.println("Параметр задан неверно. Введите год поле 1584.");
        }


        System.out.println();
        System.out.println("Exercise 4.");
        int deliveryDistance = 200;
        int oneDay = 1;
        int twoDays = 2;
        int threeDays = 3;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + oneDay + ".");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + twoDays + ".");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + threeDays + ".");
        } else {
            System.out.println("Доставки нет.");
        }


        System.out.println();
        System.out.println("Exercise 5.");
        int monthNumber = 12;
        if (monthNumber <= 12)
            switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("0сенний месяц.");
                break;
        }
    }
}
