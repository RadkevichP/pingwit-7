package pl.pingwit.lec_5.point_1;


import java.math.BigDecimal;
import java.util.Scanner;

/*
Написать программу для расчета стоимости страховки на автомобиль.
Пользователь вводит объем двигателя в см3, постоянный клиент?
были ли дтп?
Тариф - 0.25 евро за см3, если клиент постоянный - скидка 20% (коэффициент 0.8),
если были дтп - надбавка 20% (коэфф 1.2)

Пример:  (1600*0.25*1.2*0.8=384)
    Введите объем двигателя в см3:
    1600
    Были ДТП за прошлый год?
    true
    Страховались у нас?
    true
    Ваш полис стоит 384 евро
 */
public class PolicyCostCalculator {
    // BigDecimal
    // 3 параметра вводит пользователь
    // 3 параметра предустановлены в системе - done
    private static final BigDecimal BASE_RATE = new BigDecimal("0.25");
    private static final BigDecimal OLD_CLIENT_RATE = new BigDecimal("0.8");
    private static final BigDecimal CRASH_RATE = new BigDecimal("1.2");


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объем в см3:");
        int volume = scanner.nextInt();
        BigDecimal volumeBigDecimal = new BigDecimal(volume);

        System.out.println("страховались у нас ранее? true/false");
        boolean isOldClient = scanner.nextBoolean();

        System.out.println("были ли у вас аварии? true/false");
        boolean isCrash = scanner.nextBoolean();

        BigDecimal finishPrice = BASE_RATE.multiply(volumeBigDecimal);

        if (isOldClient) {
            finishPrice = finishPrice.multiply(OLD_CLIENT_RATE);
        }
        if (isCrash) {
            finishPrice = finishPrice.multiply(CRASH_RATE);
        }

        System.out.println("ваш полис будет стоить " + finishPrice + " euro");
    }
}
