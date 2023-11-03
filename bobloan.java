public class bobloan {
        public static void main(String[] args) {
            Loan bobLoan = new Loan(500000, 0.18);
            double totalAmountPaid = bobLoan.calculateTotalAmountPaid(3);
            System.out.println("Total amount paid by Mr. Bob 3 years after taking loan is: " + totalAmountPaid + " RWF");
        }
    }
    
    class Loan {
        public double principal;
        public double monthlyInterestRate;
    
        public Loan(double principal, double annualInterestRate) {
            this.principal = principal;
            this.monthlyInterestRate = annualInterestRate / 12.0; // Monthly interest rate
        }
    
        public double calculateTotalAmountPaid(int years) {
            int months = years * 12;
            double totalAmount = principal;
            
            for (int i = 0; i < months; i++) {
                totalAmount += totalAmount * monthlyInterestRate;
            }
            
            return totalAmount;
        }
    }