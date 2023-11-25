package Bank_collections;

public class AccountCredit<T extends PersonalData> extends Account<T>{
    public AccountCredit(T data, double amount) {
        super(data, amount);
    }
}
