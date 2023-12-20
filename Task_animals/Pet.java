package Task_animals;

public class Pet extends Animal{
    //protected  int id;
    protected String type_p;
    protected String breed;
    protected int smell;
    protected int noise;


    public Pet(int id, String type_a, String birth_date, String name_a, String type_p, String breed, int smell, int noise) {
        super(id, type_a, birth_date, name_a);
        this.type_p = type_p;
        this.breed = breed;
        this.smell = smell;
        this.noise = noise;
    }

    protected void toСargo() {
        System.out.println("Режим перевозки для " + TYPE + " включен");
    }


}
