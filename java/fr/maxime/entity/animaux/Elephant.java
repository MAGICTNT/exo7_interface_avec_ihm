package fr.maxime.entity.animaux;

public class Elephant extends Animal{
    private String name;
    private int age;
    private int poids;

    public Elephant(String name, int age, int poids) {
        this.name = name;
        this.age = age;
        this.poids = poids;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poids=" + poids +
                '}';
    }
}
