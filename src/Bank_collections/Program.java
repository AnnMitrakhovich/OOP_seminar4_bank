package Bank_collections;
//var ключевое слово используется, чтобы сократить запись кода
// тип данных компилятор узнает, т.к.есть четкие инструкции для компилятора
// обобщения делают гибкой программу и универсальной для разных типов данных
public class Program {
    public static void main(String[] args) {
        var person1 = new Person("Петров А.Г.", "123456789");
        var organization1 = new Entity("DNK", "1909546758");
        AccountCredit<Person> account1 = new AccountCredit<>(person1, 300);
        AccountDebit<Entity> account2 = new AccountDebit<>(organization1, 3900);
        var tr1 = new Transaction<>(account2, account1, 500);
        tr1.execute();
    }
}
