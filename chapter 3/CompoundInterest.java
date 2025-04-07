public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; 
        int years = 10; 
        System.out.printf("%-10s %-10s %-10s%n", "Rate (%)", "Year", "Amount");

        // Loop through interest rates from 5% to 10%
        for (double rate = 5.0; rate <= 10.0; rate++) {
            System.out.println("Interest Rate: " + rate + "%");

            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + (rate / 100.0), year);
                System.out.printf("%-10.1f %-10d %-10.2f%n", rate, year, amount);
            }

            System.out.println(); 
        }
    }
}
