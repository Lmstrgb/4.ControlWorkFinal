package Task_animals;

import java.time.LocalDate;

public class Animal {
    protected  int id;
    protected String type_a;
    protected String birthDate;
    protected String name_a;
    protected final String TYPE = getClass().getSimpleName();
   // protected Boolean isVaccinated;
    // protected final String TYPE = getClass().getSimpleName();

    public Animal(int id, String type_a, String birthDate, String name_a) {
        this.id = id;
        this.type_a = type_a;
        this.birthDate = birthDate;
        this.name_a = name_a;
    }

    public int getId() {
        return id;
    }

    public String getType_a() {
        return type_a;
    }

    public String getBirthdate() {
        return birthDate;
    }

    public String getName_a() {
        return name_a;
    }

    public String toString() {
        return "Id: " + id + " Name: "+ name_a + ", Type: " + TYPE+ ", BirthDate: " + getBirthdate();
    }

}
