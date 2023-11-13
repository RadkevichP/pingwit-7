package pl.pingwit.lec_13.point_4;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public class RemoteDatabaseService {

    /**
     * Finds employee daily rate
     *
     * @param name   Employee name
     * @return  daily salary rate
     * @throws IOException
     */
    public Integer findSalaryRateByEmployeeName(String name) throws IOException {
        System.out.println("Connect to the DB...........");
        System.out.println("Connect to the DB...........");
        System.out.println("Connect to the DB...........");

        if (RandomUtils.nextBoolean()) {
            throw new IOException("Problem with connection to the DB!!!");
        }

        System.out.println("Successfully connected!");
        return RandomUtils.nextInt(100, 200);
    }

}
