package pl.pingwit.lec_13.point_4;

import java.io.IOException;
import java.util.logging.Logger;

public class SalaryCalculationService {

    private static final Logger LOGGER = Logger.getLogger("SalaryCalculationService.class");
    private final RemoteDatabaseService remoteDatabaseService;

    public SalaryCalculationService(RemoteDatabaseService remoteDatabaseService) {
        this.remoteDatabaseService = remoteDatabaseService;
    }

    public String calculateSalaryForEmployee(String employeeName) {
        try {
            Integer dailyRate = remoteDatabaseService.findSalaryRateByEmployeeName(employeeName);
            LOGGER.info("Requsted salary for " + employeeName);

            Integer salary = dailyRate * 22;
            return String.format("%s salary for this month is %d", employeeName, salary);
        } catch (IOException e) {
            LOGGER.severe("Problem with connection to DB. " + employeeName);
            throw new PingwitException("Уважаемый пользователь, у нас возникла техническая неисправность, попробуйте позже!");
        }
    }
}
