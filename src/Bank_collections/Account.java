package Bank_collections;
// счета будут разные
public abstract class Account<T extends PersonalData> {
    private T data;
    private double amount;

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Счет {" +
                "клиент = " + data +
                ", остаток = " + amount +
                '}';
    }
}


