public class CreditPaymentService {
    public double calculate(double summ, double percentYear, int numberMonth) {

        double percentMonth = percentYear / 100 / 12;
        double sumMonth = summ * (percentMonth + percentMonth / (Math.pow(1 + percentMonth, numberMonth) - 1));

        return sumMonth;
    }
}
