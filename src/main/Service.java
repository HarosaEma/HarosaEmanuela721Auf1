package main;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {

    public List<Client> sortListeClientByNrEmpl(List<Client> liste){
        return liste.stream()
                .sorted((client, otherClient) -> client.getNrEmpl().compareTo(otherClient.getNrEmpl()))
                .collect(Collectors.toList());
    }

    

}
