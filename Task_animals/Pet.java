package Task_animals;

import java.time.LocalDate;

public class Pet extends Animal{
    //protected  int id;
    protected String type_p;
    protected String breed;
    protected int smell;
    protected int noise;


    public Pet(int id, String type_a, LocalDate birth_date, String name_a, String type_p, String breed, int smell, int noise) {
        super(id, type_a, birth_date, name_a);
        this.type_p = type_p;
        this.breed = breed;
        this.smell = smell;
        this.noise = noise;
    }

    protected void cmdСargo() {
        System.out.println("Режим перевозки для " + TYPE + " включен");
    }

    public String getType_p() {
        return type_p;
    }

    public String getBreed() {
        return breed;
    }

    public int getSmell() {
        return smell;
    }

    public int getNoise() {
        return noise;
    }



}
