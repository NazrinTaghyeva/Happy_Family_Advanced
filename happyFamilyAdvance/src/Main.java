public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("cat", "Kuki", 5, 25, new String[]{"eating", "sleeping"});

        Human mother = new Human("Melina", "Doe", 1983);
        Human father = new Human("John", "Doe", 1975);
        Family mFamily = new Family(mother,father);
        Human child1 = new Human("Nazryn","Doe",2003,90,pet,father,mother, new String[][]{{"thursday", "watch the film"}});
        Human child2 = new Human("Kate","Doe",2020,80,pet,father,mother, new String[][]{{"saturday", "meet the friends"}});

        mFamily.addChild(child1);
        mFamily.addChild(child2);
        System.out.println(mFamily);
    }

}