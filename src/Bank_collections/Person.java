package Bank_collections;
// физ.лицо - клиент банка
public class Person implements PersonalData{
    private String name;
    private String inn;

    public String getName() {
        return name;
    }



    public Person(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String getINN() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("ФИО %s %s", name, inn);
    }
}
