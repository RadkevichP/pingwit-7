package pl.pingwit.lec_28.point_3;

public class MoneyPostfixProcessor {
    public String addMoneyPostfix(Integer x) {
        int rest100 = x % 100;
        if (rest100 >= 10 && rest100 <= 19) {
            return x + " рублей";
        }
        int rest10 = x % 10;
        if (rest10 == 1) {
            return x + " рубль";
        }
        if (rest10 >= 2 && rest10 <= 4) {
            return x + " рубля";
        }
        return x + " рублей";
    }
}
