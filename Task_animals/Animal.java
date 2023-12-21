package Task_animals;

import java.time.LocalDate;

public class Animal {
    protected  int id;
    protected String type_a;
    protected LocalDate birth_date;
    protected String name_a;
    protected final String TYPE = getClass().getSimpleName();
   // protected Boolean isVaccinated;
    // protected final String TYPE = getClass().getSimpleName();

    public Animal(int id, String type_a, LocalDate birth_date, String name_a) {
        this.id = id;
        this.type_a = type_a;
        this.birth_date = birth_date;
        this.name_a = name_a;
    }

    public int getId() {
        return id;
    }

    public String getType_a() {
        return type_a;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public String getName_a() {
        return name_a;
    }


}
