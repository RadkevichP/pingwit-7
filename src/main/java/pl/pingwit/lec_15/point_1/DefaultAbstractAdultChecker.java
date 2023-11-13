package pl.pingwit.lec_15.point_1;

public class DefaultAbstractAdultChecker extends AbstractAdultChecker {

    public static final int DEFAULT_ADULT_AGE = 18;

    @Override
    protected int getAdultAge() {
        return DEFAULT_ADULT_AGE;
    }
}
