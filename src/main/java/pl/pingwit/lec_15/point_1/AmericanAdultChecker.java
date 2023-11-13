package pl.pingwit.lec_15.point_1;

public class AmericanAdultChecker extends AbstractAdultChecker {

    public static final int AMERICAN_ADULT_AGE = 21;

    @Override
    protected int getAdultAge() {
        return AMERICAN_ADULT_AGE;
    }
}
