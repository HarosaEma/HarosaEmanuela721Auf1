package main;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Client> listeClient = repo.readFromFile("D:\\MAP\\ExamenPractic\\Aufgabe1\\src\\main\\clientdaten.txt", ",");

            System.out.println(service.sortListeClientByNrEmpl(listeClient));

            repo.writeToFile("D:\\MAP\\ExamenPractic\\Aufgabe1\\src\\main\\SortireClient.txt", listeClient, " ");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
