package Task_animals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class AnimalRegistry {
    private ArrayList<Animal> animals = new ArrayList<>();
    private int animalCount = 0;

    //private int petCount;
    //private int packAnimalCount;

    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id животного");
        int id = scanner.nextInt();
        System.out.println("Введите имя животного: ");
        String name_a = scanner.nextLine();
        System.out.println("Введите тип животного (Pet или PackAnimal): ");
        String type_a = scanner.nextLine();
        System.out.println("Введите дату рождения животного (dd-mm-yyyy): ");
        String birthDate = scanner.nextLine();
        System.out.println("Введите вес животного: ");
        double weight = scanner.nextDouble();

        if (type_a.equalsIgnoreCase("Pet")) {
            System.out.println("Введите породу животного");
            String breed = scanner.next();
            System.out.println("Введите тип домашнего питомца");
            String type_p = scanner.next();
            System.out.println("Введите по 10-ти бальной шкале уровень запаха животного: ");
            int smell = scanner.nextInt();
            System.out.println("Введите по 10-ти бальной шкале уровень шума животного: ");
            int noise = scanner.nextInt();
            Pet pet = new Pet(id, type_a, birthDate, name_a,type_p,breed, smell, noise);
            animals.add(pet);
            animalCount++;
            System.out.println("Домашнее животное успешно добавлено: ");
        } else if (type_a.equalsIgnoreCase("PackAnimal")) {
            System.out.println("Введите тип вьючного животного: ");
            String type_pa = scanner.next();
            System.out.println("Введите максимальный вес, перевозимый животным: ");
            int transported_weight = scanner.nextInt();
            System.out.println("Животное даёт пригодное для человкека молоко?: ");
            Boolean milk = scanner.nextBoolean();
            System.out.println("Животное даёт пригодную для использования шерсть?: ");
            Boolean wool = scanner.nextBoolean();
            PackAnimal packAnimal = new PackAnimal(id,  type_a, birthDate,  name_a,  type_pa,  transported_weight,  milk,  wool);
            animals.add(packAnimal);
            animalCount++;
            System.out.println("Вьючное животное успешно добавлено: ");
        } else {
            System.out.println("Реестр не предусмотрен для этого типа животных! ");
        }
    }


    public void printAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public void addCmd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id животного");
        int id = scanner.nextInt();
        boolean found = false;
        for (Animal animal: animals) {
            if (animal.getId() == id && animal instanceof  Pet){
                Pet pet = (Pet) animal;
                System.out.println("Введите новую команду для домашних питомцев: ");
                String command = scanner.next();
                pet.addCmd(command);
                found = true;
                System.out.println("Команда для Pet добавлена успешно");
                break;
            } else if (animal.getId() == id && animal instanceof  PackAnimal){
                PackAnimal packAnimal = (PackAnimal) animal;
                System.out.println("Введите новую команду для вьючных");
                String command = scanner.next();
                packAnimal.addCmd(command);
                found= true;
                System.out.println("Команда для PackAnimal добавлена успешно");
            }
            }
        if (!found) {System.out.println("Животное не найдено: "); }

        }




    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            System.out.println("Выберете действие: ");
            System.out.println("1. Добавить животное");
            System.out.println("2. Список команд животного");
            System.out.println("3. Добавить команду для животного");
            System.out.println("4. Тренировать животное");
            System.out.println("5. Список животных по дате рождения");
            System.out.println("6. Показать количество животных");
            System.out.println("7. Показать всех животных");
            System.out.println("0. Выход");
            // System.out.println();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    addCmd();
                    break;
                case 3:
                    System.out.println("Пункт находится в разработке");
                    break;
                case 4:
                    System.out.println("Пункт находится в разработке");
                    break;
                case 5:
                    System.out.println("Пункт находится в разработке");
                    break;
                case 6:
                    System.out.println("Пункт находится в разработке");
                    break;
                case 7:
                    System.out.println("Все животные: ");
                    printAllAnimals();
                    break;
                case 0:
                    System.out.println("Пока");
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }

        }
    }

}

    /* public AnimalRegistry() {
        this.animals = new ArrayList<Animal>();
        this.petCount = 0;
        this.packAnimalCount = 0;
    }

    public void addPet(int id, String type_a, LocalDate birth_date, String name_a, String type_p, String breed, int smell, int noise) {
        Pet pet = new Pet(id, type_a, birth_date, name_a,type_p,breed, smell, noise);
        animals.add(pet);
        petCount++;
        System.out.println("Домашнее животное добавлено успешно");
    }

    public void addPackAnimal(int id, String type_a, LocalDate birth_date, String name_a, String type_pa, int transported_weight, Boolean milk, Boolean wool) {
        PackAnimal packAnimal = new PackAnimal(id, type_a, birth_date, name_a, type_pa, transported_weight, milk, wool);
        animals.add(packAnimal);
        packAnimalCount++;
        System.out.println("Вьючное животное добавлено успешно");
    }

} */

