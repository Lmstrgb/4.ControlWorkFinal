package Task_animals;

import java.util.ArrayList;

public class PackAnimal extends Animal{
   // protected  int id;
    protected String type_pa;
    protected int transported_weight;
    protected Boolean milk;
    protected Boolean wool;
    protected ArrayList<String> commands = new ArrayList<>();

    public PackAnimal(int id, String type_a, String birth_date, String name_a, String type_pa, int transported_weight, Boolean milk, Boolean wool) {
        super(id, type_a, birth_date, name_a);
        this.type_pa = type_pa;
        this.transported_weight = transported_weight;
        this.milk = milk;
        this.wool = wool;
    }

    protected void cmdCaress() {
        System.out.println("Ласковый режим " + TYPE + " включен");
    }
    public String getType_pa() {
        return type_pa;
    }

    public int getTransported_weight() {
        return transported_weight;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isWool() {
        return wool;
    }
    public  void addCmd(String command){
        this.commands.add(command);
    }

    public void getCommands() {
        System.out.println(String.join(", ", commands));
    }

}
