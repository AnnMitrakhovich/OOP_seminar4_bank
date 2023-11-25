package Bank_collections;
//организация - клиент банка
public class Entity implements PersonalData{
    private String name;
    private String inn;

    public String getName() {
        return name;
    }
    public Entity (String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String getINN() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("Организация %s %s", name, inn);
    }
}
