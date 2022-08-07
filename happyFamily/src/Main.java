public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Female","Koukie",2,15,new String[]{"eating","sleeping"});
        Human mother = new Human("Nuray","Doe",1985);
        Human father = new Human("John","Doe",1980);

        Family mFamily = new Family(mother,father);
        Human child = new Human("Zuzu","Doe",2000,80,new String[][]{{"monday","watch the film"},{"sunday","meet the friends"}});
        Human child1 = new Human("Kate", "Parry", 2004, 90, new String[][]{{"monday","watch the film"},{"sunday","meet the friends"}});



        mFamily.addChild(child);
        mFamily.addChild(child1);
        System.out.println(mFamily);
        mFamily.feed();
        mFamily.deleteChild(1);
        System.out.println(mFamily);
        System.out.println(mFamily.countFamily());
    }
}
