package dio.example.design.pattern.project1;

import dio.example.design.pattern.project1.structure.Facade;

public class MainFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.migrateClient("joao", "2");
    }
}
