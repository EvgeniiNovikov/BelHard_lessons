public class MasterCard extends BankCard
{
    private int balance;

    public MasterCard(int balance) {
        super("ASB", "Vasya Pupkin", "45123141545");
        if(balance > 0){
            this.balance = balance;
        }
    }


    @Override
    void balance() {
        System.out.println(getUserName() + " balance: " + balance);
    }

    @Override
    public void sendMoney(int sum) {
        System.out.println("Send " + getUserName() + " money " + sum);
        balance -= sum;

    }

    @Override
    public void addMoney(int sum) {
        System.out.println("Add " + getUserName() + " money: " + sum);
        balance += sum;

    }

    @Override
    public void showInfo() {
        System.out.println( "Name: " + getUserName() + " ID: " + getUserId() + " Balance: " + balance + " BankOwner: " + getBankOwner());
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
