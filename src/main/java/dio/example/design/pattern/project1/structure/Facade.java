package dio.example.design.pattern.project1.structure;

public class Facade {
    public void migrateClient(String name, String code) {
        Client client = new Client();

        client.city = CrmZipCodeApi.getCity(code);
        client.state = CrmZipCodeApi.getState(code);
        client.name = name;
        client.zipCode = code;
        client.address = "N/A";
        
        CrmService.saveClient(client);
    }
}
