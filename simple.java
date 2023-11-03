public class simple {
        public static void main(String[] args) {
            // Create an instance of the BankAccount class
            BankAccount bobAccount = new BankAccount(100000, 5, 0.05);
    
            double simple = bobAccount.calculateSimpleInterest(5); // Calculation the simple interest

            System.out.println("Mr. Bob's Simple Interest after 5 years is: " + simple + " RWF");// Output the result on screen
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
    
        public double calculateSimpleInterest(int years) {
            double interest = principal * annualRate * years;
            return interest;
        }
    }

