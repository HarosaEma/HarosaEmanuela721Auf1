package main;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {
    /**
     * @param liste
     * @return
     */
    public List<Client> sortListeClientByNrEmpl(List<Client> liste) {
        return liste.stream()
                .sorted((client, otherClient) -> client.getNrEmpl().compareTo(otherClient.getNrEmpl()))
                .collect(Collectors.toList());
    }

    /**
     *
     * @param clients
     * @return
     */
    public String getTopOfPlaces(List<Client> clients) {
        Map.Entry<Integer, Long> maxLocation = clients.stream()
                .collect(Collectors.groupingBy(Client::getIncomes, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NullPointerException::new);

        return maxLocation.getKey() + ": " + maxLocation.getValue();
    }

}





}
