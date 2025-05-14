public class Main {
    public static void main(String[] args) {
        int balance = 250;
        int upAmmount = 900;

        int bonus;
        if (upAmmount > 1000) {
            bonus = upAmmount / 100;
        } else {
            bonus = 0;
        }

        int totalBalance = balance + upAmmount + bonus;

        System.out.println("Текущий баланс: " + balance + " руб.");
        System.out.println("Сумма пополнения: " + upAmmount + " руб.");
        System.out.println("Начислено бонусных рублей: " + bonus + " руб.");
        System.out.println("Итоговый счёт: " + totalBalance + " руб.");


    }
}