package fr.maxime;

import fr.maxime.entity.animaux.Elephant;
import fr.maxime.entity.animaux.EnclosDesElephants;
import fr.maxime.entity.animaux.EnclosDesLions;
import fr.maxime.entity.animaux.Lion;

import java.util.Scanner;

public class Main {

    private static EnclosDesLions enclosDesLions = new EnclosDesLions();
    private static EnclosDesElephants enclosDesElephants = new EnclosDesElephants();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Créer un animal");
            System.out.println("2. Créer un enclos");
            System.out.println("3. Ajouter un animal à un enclos");
            System.out.println("4. Visualiser les animaux dans un enclos");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne

            switch (choix) {
                case 1:
                    creerAnimal();
                    break;
                case 2:
                    creerEnclos();
                    break;
                case 3:
                    ajouterAnimalEnclos();
                    break;
                case 4:
                    visualiserAnimauxEnclos();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
    private static void creerAnimal() {
        System.out.print("Type d'animal (Lion/Elephant) : ");
        String type = scanner.nextLine();

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Age : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consomme le retour à la ligne

        if (type.equalsIgnoreCase("Lion")) {
            Lion lion = new Lion(nom, age);
            enclosDesLions.ajouterAnimal(lion);
        } else if (type.equalsIgnoreCase("Elephant")) {
            System.out.print("Poids : ");
            int poids = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne

            Elephant elephant = new Elephant(nom, age, poids);
            enclosDesElephants.ajouterAnimal(elephant);
        } else {
            System.out.println("Type d'animal invalide.");
        }
    }

    private static void creerEnclos() {
        System.out.println("Les enclos sont déjà créés par défaut pour les lions et les éléphants.");
    }

    private static void ajouterAnimalEnclos() {
        System.out.print("Type d'enclos (Lion/Elephant) : ");
        String type = scanner.nextLine();

        System.out.print("Nom de l'animal : ");
        String nom = scanner.nextLine();

        System.out.print("Age de l'animal : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consomme le retour à la ligne

        if (type.equalsIgnoreCase("Lion")) {
            Lion lion = new Lion(nom, age);
            enclosDesLions.ajouterAnimal(lion);
        } else if (type.equalsIgnoreCase("Elephant")) {
            System.out.print("Poids de l'animal : ");
            int poids = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne

            Elephant elephant = new Elephant(nom, age, poids);
            enclosDesElephants.ajouterAnimal(elephant);
        } else {
            System.out.println("Type d'enclos invalide.");
        }
    }

    private static void visualiserAnimauxEnclos() {
        System.out.print("Type d'enclos (Lion/Elephant) : ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Lion")) {
            System.out.println("Animaux dans l'enclos des lions:");
            enclosDesLions.afficherAnimaux();
        } else if (type.equalsIgnoreCase("Elephant")) {
            System.out.println("Animaux dans l'enclos des éléphants:");
            enclosDesElephants.afficherAnimaux();
        } else {
            System.out.println("Type d'enclos invalide.");
        }
    }
}