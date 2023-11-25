package Bank_collections;

public class AccountDebit<T extends PersonalData> extends Account<T>{


    public AccountDebit(T data, double amount) {
        super(data, amount);
    }
}
