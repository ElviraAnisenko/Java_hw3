public class Main {
    public static void main(String[] args) {
        int account = 112;
        int refill = 120;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей " + bonus + " рублей(ля)");
        System.out.println("Итоговый счет " + (account + bonus + refill) + " рублей(ля)");
    }
}
