public abstract class BankCard implements TransAction
{
    private String bankOwner;
    private String userName;
    private String userId;

    public BankCard(String bankOwner, String userName, String userId) {
        this.bankOwner = bankOwner;
        this.userName = userName;
        this.userId = userId;
    }

    abstract void balance();
    abstract void showInfo();

    public String getBankOwner() {
        return bankOwner;
    }

    public void setBankOwner(String bankOwner) {
        this.bankOwner = bankOwner;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
