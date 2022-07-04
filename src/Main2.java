// Задание 2
public class Main2 {
    public static void main(String[] args) {
        int account = 656; // начальный аккаунт
        int cash = 1001; // сумма пополнения
        int bonus; // начисляемые бонусные рубли

        if (cash > 1000) {
            bonus = (int) (0.01 * cash);
        } else {
            bonus = 0;
        }
        int final_account = account + cash + bonus; // итоговый счет после пополнения
        String rub = " руб.";
        String acc = "Баланс счета: ";
        String gratification = "Начисленные бонусные рубли: ";
        System.out.println(acc + final_account + rub);
        System.out.println(gratification + bonus + rub);
    }
}
