import java.util.ArrayList;

public abstract class Employee {
    public abstract boolean addClient(Client client);

    private ArrayList<Client> getClients()
    {
        return getClientHelper();
    }

    public abstract ArrayList<Client> getClientHelper();

    public abstract String toString();
}
