public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human father;
    private Human mother;
    private String[][] schedule;

    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() +
                ", iq=" + getIq() +
                ", pet=" + getPet() +
                ", father=" + getFather().getName() + " " + getFather().getSurname() +
                ", mother=" + getMother().getName() + " " + getMother().getSurname() +
                '}';
    }

    public Human(String name, String surname, int year) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
    }

    public Human() {

    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setIq(iq);
        this.setPet(pet);
        this.setFather(father);
        this.setMother(mother);
        this.setSchedule(schedule);
    }



    public void greetPet() {
        System.out.println("Hello, " + getPet().nickName);
    }

    public void describePet() {
        String sly = "";
        if (getPet().trickLevel > 50) {
            sly = "very sly";
        } else {
            sly = "almost not sly";
        }

        System.out.println("I have " + getPet().species + ", he is " + getPet().age + " years old, he is " + sly);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}
