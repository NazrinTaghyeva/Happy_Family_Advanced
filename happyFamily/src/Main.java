public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("cat", "Kuki", 5, 25, new String[]{"eating", "sleeping"});

        Human mother = new Human("Melina", "Doe", 1983);
        Human father = new Human("John", "Doe", 1975);

        Human child = new Human("Nazryn","Doe", 2003,180, pet, father,mother, new String[][]{{"thursday", "watch the film"}});

        child.greetPet();
        child.describePet();
        pet.respond();
        pet.eat();

        System.out.println(child);
    }

}

