package Task_animals;

public class PackAnimal extends Animal{
    protected  int id;
    protected String type_pa;
    protected int transported_weight;
    protected Boolean milk;
    protected Boolean wool;

    public PackAnimal(int id, String type_a, String birth_date, String name_a, String type_pa, int transported_weight, Boolean milk, Boolean wool) {
        super(id, type_a, birth_date, name_a);
        this.type_pa = type_pa;
        this.transported_weight = transported_weight;
        this.milk = milk;
        this.wool = wool;
    }

    protected void toCaress() {
        System.out.println("Ласковый режим " + TYPE + " включен");
    }


}
