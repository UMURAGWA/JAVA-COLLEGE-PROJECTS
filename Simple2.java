public class Simple2 {
  
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount(100000, 5, 0.05);
        double simple = bobAccount.calculateSimpleInterest();
        System.out.println("Mr. Bob's Simple Interest after 5 years: " + simple + " RWF");
    }
}

class BankAccount {
    private double principal;
    private int years;
    private double annualRate;

    public BankAccount(double principal, int years, double annualRate) {
        this.principal = principal;
        this.years = years;
        this.annualRate = annualRate;
    }

    public double calculateSimpleInterest() {
        return principal * annualRate * years;
    }
}
