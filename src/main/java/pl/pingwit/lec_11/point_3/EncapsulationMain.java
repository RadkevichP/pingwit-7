package pl.pingwit.lec_11.point_3;

import pl.pingwit.lec_11.DatabaseUtils;

public class EncapsulationMain {

    public static void main(String[] args) {
        DatabaseUtils databaseUtils = new DatabaseUtils();

        String url = databaseUtils.provideDBUrl();
        System.out.println(url);
    }
}
