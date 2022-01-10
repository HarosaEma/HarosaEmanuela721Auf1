package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    List<Client> clients;


    /**
     *
     * @param fileName
     * @param character
     * @return
     * @throws IOException
     */


    public List<Client> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Client client;
        List<Client> listeClient = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            client = new Client(Integer.parseInt(attributes[0]), attributes[1], CompanySize.valueOf(attributes[2]), Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]), attributes[5]);
            listeClient.add(client);

            line = bufferedReader.readLine();
        }

        return listeClient;
    }

    /**
     *
     * @param fileName
     * @param liste
     * @param character
     * @throws IOException
     */

    public void writeToFile(String fileName, List<Client> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Client client : liste) {
            String line = client.getId() + character + client.getCompanyName() + character +
                    client.getCompanySize() + character + client.getNrEmpl() + character + client.getIncomes() + character +
                    client.getLocation();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }



}
