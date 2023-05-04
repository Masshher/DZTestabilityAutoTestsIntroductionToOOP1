public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment1year = service.calculate(1000000,12,9.99);
        System.out.println("Ежемесячный платёж по кредиту на 1 год составит: " + payment1year);
        System.out.println();
        int payment2years = service.calculate(1000000,24,9.99);
        System.out.println("Ежемесячный платёж по кредиту на 2 года составит: " + payment2years);
        System.out.println();
        int payment3years = service.calculate(1000000,36,9.99);
        System.out.println("Ежемесячный платёж по кредиту на 3 года составит: " + payment3years);
    }
}