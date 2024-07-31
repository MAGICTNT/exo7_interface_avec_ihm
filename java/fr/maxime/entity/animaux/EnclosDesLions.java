package fr.maxime.entity.animaux;

import java.util.ArrayList;
import java.util.List;

public class EnclosDesLions {
    private List<Lion> lions;

    public EnclosDesLions() {
        this.lions = new ArrayList<>();
    }

    public void ajouterAnimal(Lion lion) {
        lions.add(lion);
    }

    public void afficherAnimaux() {
        for (Lion lion : lions) {
            System.out.println(lion);
        }
    }
}
