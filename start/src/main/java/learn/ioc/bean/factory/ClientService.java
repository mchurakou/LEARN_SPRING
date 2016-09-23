package learn.ioc.bean.factory;

/**
 * Created by mikalai on 18.09.2016.
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }

}
