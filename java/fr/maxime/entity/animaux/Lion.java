package fr.maxime.entity.animaux;

public class Lion extends Animal {
    private String nom;
    private int age;

    public Lion(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
