package fr.maxime.entity.animaux;

import java.util.ArrayList;
import java.util.List;

public class EnclosDesElephants {
    private List<Elephant> elephants;

    public EnclosDesElephants(){
        this.elephants = new ArrayList<>();
    }

    public void ajouterAnimal(Elephant elephant){
        elephants.add(elephant);
    }

    public void afficherAnimaux(){
        for(Elephant elephant : elephants){
            System.out.println(elephant);
        }
    }
}
