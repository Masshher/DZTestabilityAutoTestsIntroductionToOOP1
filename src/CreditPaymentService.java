public class CreditPaymentService {

    public int calculate(int sum, int period, double bid) {
        double percentage_share = bid / 12 / 100;
        double payment = sum * ((percentage_share * Math.pow((1 + percentage_share), period)) / (Math.pow((1+percentage_share), period) - 1));

        return (int) payment;
    }
}
