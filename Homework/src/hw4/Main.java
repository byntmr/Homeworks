package hw4;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"Run", "Eat", "Sleep"};
        String[][] schedule = {{"Sunday", "Suffer"}, {"Monday", "Suffer"}};

        Human mother = new Human("Half-Empty", "Vessel", 1945);
        Human father = new Human("Empty", "Vessel", 1942);
        Pet pet = new Pet("Ancient Abomination", "Garfield", 4638, 99999, habits);
        Human child = new Human("Observer", "Vessel", 1999, 120, pet, mother, father, schedule);

        System.out.println(pet.toString());
        System.out.println(child.toString());
    }
}