package Bank_collections;
//для Т ограничение типом данным, пренадлежит Account
// а DA и CA наследники класса A
public class Transaction<T extends Account> {
    private final T from;
    private final T to;

    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() >= amount) {
            System.out.printf("Счет списания %s - счет зачисления %s", from.getData(), to.getData());
            System.out.printf("Проведено %.2f",amount);
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println("Остаток на счете отправителя " + from.getAmount());
            System.out.println("Остаток на счете получателя " + to.getAmount());
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
