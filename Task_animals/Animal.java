package Task_animals;

public class Animal {
    protected  int id;
    protected String type_a;
    protected String birth_date;
    protected String name_a;
    protected final String TYPE = getClass().getSimpleName();
   // protected Boolean isVaccinated;
    // protected final String TYPE = getClass().getSimpleName();

    public Animal(int id, String type_a, String birth_date, String name_a) {
        this.id = id;
        this.type_a = type_a;
        this.birth_date = birth_date;
        this.name_a = name_a;
    }

    public int getId() { // геттер для получения доступа к полю
        return this.id;
    }


}
