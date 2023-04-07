package Account;

public class Account {

        private double balance;

        private double withdrawal;

        public void deposit(double amount) {
            if(amount>0 ) balance = amount + balance;
        }
        public void withdrawal(double amount) {
            if (amount < 0) {
                System.out.println("invalid input");
            } else if (amount > balance){
                System.out.println( "input again !");
            }
            else balance = balance -amount;
        }
        public void withdrawal(int amount) {
            if (amount < 0) {
                System.out.println("invalid input");
            } else if (amount > balance){
                System.out.println( "input again !");
            }
            else balance = balance -amount;
        }
        public void withdrawal(float amount) {
            if (amount < 0) {
                System.out.println("invalid input");
            } else if (amount > balance){
                System.out.println( "input again !");
            }
            else balance = balance -amount;
        }

        public double getBalance() {
            return balance;
        }

    }
