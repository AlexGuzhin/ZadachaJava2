//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account = 100;
        int bonusScale = 100;
        int amount = 1100;
        int bonus;
        if (amount > 1000) {
            bonus = amount / bonusScale;
        } else {
            bonus = 0;
        }
        int finalaccount = account + amount + bonus;

        System.out.println(" Вы пополнили на " + amount + " руб. ");
        System.out.println(" Ваш бонус составит " + bonus + " руб. ");
        System.out.println(" Итого на счету " + finalaccount + " руб. ");
    }
}