import java.util.Arrays;

public class Pet {
    String species;
    String nickName;
    int age;
    int trickLevel;
    String[] habits;

    public String toString() {
        return species + "{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }


    public Pet() {
    }


    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickName + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

}