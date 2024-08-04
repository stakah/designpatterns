package dio.example.design.pattern.project1.structure;

import java.util.ArrayList;
import java.util.List;

public class CrmService {
    private static List<Client> clients = new ArrayList<>();

    public static void saveClient(Client client) {
        clients.add(client);

        System.out.println(client);
    }

    public static List<Client> getClients() {
        return clients;
    }
}
