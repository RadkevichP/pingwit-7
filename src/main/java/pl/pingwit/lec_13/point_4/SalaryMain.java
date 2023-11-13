package pl.pingwit.lec_13.point_4;

public class SalaryMain {
    public static void main(String[] args) {
        SalaryCalculationService salaryCalculationService = new SalaryCalculationService(new RemoteDatabaseService());

        System.out.println(salaryCalculationService.calculateSalaryForEmployee("Pavel"));
    }
}
